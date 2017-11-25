package com.github.hackertechmaster.trygroupdevelopment.implement;

import com.github.hackertechmaster.trygroupdevelopment.User;
import com.github.hackertechmaster.trygroupdevelopment.UserManager;
import com.github.hackertechmaster.trygroupdevelopment.interfaces.IBuy;

public class ConcreteBuy implements IBuy {
    @Override
    public boolean hasMoney(String username, int money) {
        User user = UserManager.INSTANCE.findUserByName(username);
        final boolean userFound = user != null;
        if(userFound) {
            final boolean moneyRemainIsEnough = user.getMoneyRemain() >= money;
            return moneyRemainIsEnough;
        } else {
            return false;
        }
    }
}
