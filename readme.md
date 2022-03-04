## SpringCloud demo

### 核心组件
- eureka 注册中心 服务注册地址
- zuul 网关 请求统一走网关 然后转发到各个服务
- 服务 例如用户系统、订单系统
- Hystrix
    - 1、熔断降级 fallback
    - 2、资源隔离


### 服务调用方式
- REST调用 正常RestTemplate调用
- Feign调用 


### 概念
- ribbon 
`ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为`
- feign
`Feign 是在 Ribbon的基础上进行了一次改进，是一个使用起来更加方便的 HTTP 客户端。采用接口的方式， 只需要创建一个接口，`

