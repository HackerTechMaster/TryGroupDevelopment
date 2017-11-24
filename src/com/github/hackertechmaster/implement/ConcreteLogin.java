package com.github.hackertechmaster.implement;

import com.github.hackertechmaster.User;
import com.github.hackertechmaster.UserManager;
import com.github.hackertechmaster.interfaces.ILogin;

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
