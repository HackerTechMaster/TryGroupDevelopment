package com.github.hackertechmaster.trygroupdevelopment.interfaces;

public interface IBuy {
    /**
     * 检查用户是否拥有足够的钱
     * @param username 用户名
     * @param money 需要的钱数
     * @return 足够则返回true,否则返回false
     */
    boolean hasMoney(String username, int money);
}
