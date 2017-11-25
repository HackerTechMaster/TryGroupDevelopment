package com.github.hackertechmaster.trygroupdevelopment;

public class User {
    private String username;
    private String password;
    private int moneyRemain;

    public User(String username, String password, int moneyRemain) {
        this.username = username;
        this.password = password;
        this.moneyRemain = moneyRemain;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoneyRemain() {
        return moneyRemain;
    }

    public void setMoneyRemain(int moneyRemain) {
        this.moneyRemain = moneyRemain;
    }
}
