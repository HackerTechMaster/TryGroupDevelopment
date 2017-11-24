package com.github.hackertechmaster.implement;

import com.github.hackertechmaster.User;
import com.github.hackertechmaster.UserManager;
import com.github.hackertechmaster.interfaces.IBuy;

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
