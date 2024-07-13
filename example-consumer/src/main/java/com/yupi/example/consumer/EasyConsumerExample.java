package com.yupi.example.consumer;

import com.yupi.example.common.model.User;
import com.yupi.example.common.service.UserService;

/**
 * 简易服务消费者启动类，示例
 *
 */
public class EasyConsumerExample
{
    public static void main( String[] args ) {
        // todo 需要获取 UserService 的实现类对象
        UserService userService = null;
        User user = new User();
        user.setName("yupi");
        // todo 需要调用 UserService 的 getUser 方法，rpc
        User result = userService.getUser(user);
        if (result != null) {
            System.out.println("获取用户成功，用户名：" + result.getName());
        } else {
            System.out.println("获取用户失败，user == null");
        }
    }
}
