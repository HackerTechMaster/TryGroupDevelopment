package com.github.hackertechmaster;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> userMap = new HashMap<>();
    public static final UserManager INSTANCE = new UserManager();

    private UserManager() {}

    public boolean addUser(User user) {
        String username = user.getUsername();
        if(!userMap.containsKey(username)) {
            userMap.put(username, user);
            return true;
        } else {
            return false;
        }
    }

    public User findUserByName(String username) {
        return userMap.get(username);
    }
}
