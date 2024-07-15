package com.yupi.example.consumer;

import com.yupi.yurpc.config.RpcConfig;
import com.yupi.yurpc.utils.ConfigUtils;

public class ConsumerExample {

    public static void main(String[] args) {
        RpcConfig rpc = ConfigUtils.loadConfig(RpcConfig.class, "rpc");
        System.out.println(rpc);
    }
}
