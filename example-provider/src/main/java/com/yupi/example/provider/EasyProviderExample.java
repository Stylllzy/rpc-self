package com.yupi.example.provider;

import com.yupi.yurpc.server.HttpServer;
import com.yupi.yurpc.server.VertxHttpServer;

/**
 * 简易服务提供者启动类
 *
 */
public class EasyProviderExample
{
    public static void main( String[] args ) {
        System.out.println( "example-provider 服务启动..." );
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);   // 启动 HTTP 服务
    }
}
