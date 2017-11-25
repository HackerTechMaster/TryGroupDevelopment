package com.github.hackertechmaster.trygroupdevelopment.implement;

import com.github.hackertechmaster.trygroupdevelopment.User;
import com.github.hackertechmaster.trygroupdevelopment.UserManager;
import com.github.hackertechmaster.trygroupdevelopment.interfaces.IRegister;

public class ConcreteRegister implements IRegister {
    @Override
    public boolean register(String username, String password) {
        User user = new User(username, password, 0);
        return UserManager.INSTANCE.addUser(user);
    }
}
