package com.github.hackertechmaster.implement;

import com.github.hackertechmaster.User;
import com.github.hackertechmaster.UserManager;
import com.github.hackertechmaster.interfaces.IRegister;

public class ConcreteRegister implements IRegister {
    @Override
    public boolean register(String username, String password) {
        User user = new User(username, password, 0);
        return UserManager.INSTANCE.addUser(user);
    }
}
