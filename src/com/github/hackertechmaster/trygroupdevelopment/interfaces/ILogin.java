package com.github.hackertechmaster.trygroupdevelopment.interfaces;

public interface ILogin {
    int OK = 0;
    int ERR_NOT_MATCHED = 1;
    /**
     * @param username
     * @param password
     * @return 登录成功返回OK，如果用户名不存在或用户名和密码不匹配就返回ERR_NOT_MATCHED
     */
    int login(String username, String password);
}
