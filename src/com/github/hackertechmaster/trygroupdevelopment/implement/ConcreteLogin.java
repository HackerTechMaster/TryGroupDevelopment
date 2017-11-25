package com.github.hackertechmaster.trygroupdevelopment.implement;

import com.github.hackertechmaster.trygroupdevelopment.User;
import com.github.hackertechmaster.trygroupdevelopment.UserManager;
import com.github.hackertechmaster.trygroupdevelopment.interfaces.ILogin;

public class ConcreteLogin implements ILogin {
    @Override
    public int login(String username, String password) {
        User user = UserManager.INSTANCE.findUserByName(username);
        final boolean userFound = user != null;
        if(userFound) {
            final boolean passwordIsCorrect = password.equals(user.getPassword());
            return passwordIsCorrect ? OK : ERR_NOT_MATCHED;
        } else {
            return ERR_NOT_MATCHED;
        }
    }
}
