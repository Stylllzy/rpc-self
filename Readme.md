# JdkSerializer手写 RPC 框架

## 简易版

- example-common：示例代码的公共依赖，包括接口、Model 等
- example-consumer：示例服务消费者代码
- example-provider：示例服务提供者代码
- yu-rpc-easy：简易版 RPC 框架



`注册中心`：简易 RPC 框架主要是跑通流程，所以暂时先不用第三方注册中心，直接把服务注册到服务提供者本地即可

- 使用线程安全的 ConcurrentHashMap 存储服务注册信息，key 为服务名称、value 为服务的实现类。之后就可以根据要调用的服务名称获取到对应的实现类，然后通过反射进行方法调用了。

`序列化器`：Serializer接口、JdkSerializer实现类，具体代码用时照抄即可

