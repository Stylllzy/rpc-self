package com.yupi.yurpc.server;

import io.vertx.core.Vertx;

/**
 * HTTP 服务接口实现类
 */
public class VertxHttpServer implements HttpServer {

    /**
     * 启动服务
     * @param port 端口
     */
    @Override
    public void doStart(int port) {
        // 1.创建 Vert.x 实例
        Vertx vertx = Vertx.vertx();
        // 2.创建 HTTP 服务器
        io.vertx.core.http.HttpServer httpServer = vertx.createHttpServer();
        // 3.监听端口并处理请求
        httpServer.requestHandler(request -> {
            // 处理 HTP 请求
            System.out.println("收到请求：" + request.method() + " " + request.uri());

            // 发送 HTTP 响应
            request.response()
                    .putHeader("content-type", "text/plain")    // 设置响应头
                    .end("Hello from Vert.x!");     // 响应内容
        });
        // 4.启动 HTTP 服务器并监听指定端口
        httpServer.listen(port, result -> {
            if (result.succeeded()) {
                System.out.println("HTTP 服务器启动成功，端口：" + port);
            } else {
                System.err.println("HTTP 服务器启动失败：" + result.cause());
            }
        });

    }
}
