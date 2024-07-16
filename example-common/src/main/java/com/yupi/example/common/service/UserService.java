package com.yupi.example.common.service;

import com.yupi.example.common.model.User;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 获取用户
     * @param user 用户
     * @return 用户
     */
    User getUser(User user);

    /**
     * 获取数量
     * @return
     */
    default short getNum() {
        return 1;
    }
}
