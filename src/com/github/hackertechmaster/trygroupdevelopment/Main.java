package com.github.hackertechmaster.trygroupdevelopment;

import com.github.hackertechmaster.trygroupdevelopment.implement.ConcreteBuy;
import com.github.hackertechmaster.trygroupdevelopment.implement.ConcreteLogin;
import com.github.hackertechmaster.trygroupdevelopment.implement.ConcreteRegister;
import com.github.hackertechmaster.trygroupdevelopment.interfaces.IBuy;
import com.github.hackertechmaster.trygroupdevelopment.interfaces.ILogin;
import com.github.hackertechmaster.trygroupdevelopment.interfaces.IRegister;

public class Main {
    private static IRegister iRegister;
    private static ILogin iLogin;
    private static IBuy iBuy;
    private static User user;

    public static void main(String[] args) {
        String username = "John";
        String password = "123";
        int moneyRequired = 20;
        iRegister = new ConcreteRegister();
        iLogin = new ConcreteLogin();
        iBuy = new ConcreteBuy();
        final boolean registerSuccess = iRegister.register(username, password);
        if(registerSuccess) {
            final boolean loginSuccess = iLogin.login(username, password) == ILogin.OK;
            if(loginSuccess) {
                user = UserManager.INSTANCE.findUserByName(username);
                user.setMoneyRemain(23);
                System.out.println("该用户剩余金额" + (iBuy.hasMoney(username, moneyRequired) ? "足够" : "不足"));
            }
        }
    }
}
