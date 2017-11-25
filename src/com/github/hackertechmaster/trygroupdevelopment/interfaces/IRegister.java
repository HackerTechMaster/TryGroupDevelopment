package com.github.hackertechmaster.trygroupdevelopment.interfaces;

public interface IRegister {
    /**
     * @param username 用户名
     * @param password 密码
     * @return 注册成功返回true，否则返回false
     */
    boolean register(String username, String password);
}
