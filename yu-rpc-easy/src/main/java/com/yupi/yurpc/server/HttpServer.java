package com.yupi.yurpc.server;

/**
 * HTTP 服务接口
 */
public interface HttpServer {

    /**
     * 启动服务
     * @param port 端口
     */
    void doStart(int port);
}
