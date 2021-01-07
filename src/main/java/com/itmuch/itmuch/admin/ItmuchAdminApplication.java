package com.itmuch.itmuch.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class ItmuchAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItmuchAdminApplication.class, args);
    }

    /**
     * Spring Boot Admin
     *  · 为Spring Boot量身打造的一个简单易用的监控数据管理工具
     *  · GitHub：https://github.com/codecentric/spring-boot-admin
     *  · 官方文档：https://codecentric.github.io/spring-boot-admin/2.1.6/
     *
     * 创建 itmuch-admin 工程进行管理
     * - 1. 引入依赖
     *  · 01). idea 创建 itmuch-admin ，选择 admin server ，
     *      创建的工程会自动带出 spring-boot-admin-dependencies 依赖管理器
     *                    和 spring-boot-admin-starter-server 依赖包。
     *  · 02). 整合 spring cloud 和 spring cloud alibaba 的依赖管理器
     *      spring-cloud-dependencies 和 spring-cloud-alibaba-dependencies
     *  · 03). 引入 nacos 注册中心依赖包
     *      spring-cloud-starter-alibaba-nacos-discovery
     *      作用：将 admin 工程注册到 nacos
     * - 2. 写注解
     *  · 01). 在启动类上添加 @EnableAdminServer 注解
     * - 3. 写配置
     *  · 01). 设置端口 : server.port: 8020
     *  · 02). 设置注册到 nacos 的名称 : spring.application.name: itmuch-admin
     *  · 03). 指定 nacos 的地址 : spring.cloud.nacos.discovery.server-addr: 39.102.66.189:8848
     * - 4. 完成上述操作进行启动工程
     *  · 01). 查看 nacos 控制台 服务管理->服务列表 已经注册了 itmuch-admin
     *  · 02). 访问 http://localhost:8020
     *  · 03). 启动 user-center 观察 nacos 已经注册了，同时 Spring Boot Admin 控制台已经监控到了 user-center ，
     *          但是 Admin 控制台上展示的 user-center 是红色的 'x' 。
     *          点击进入，访问 actuator -> http://192.168.88.1:8081/actuator -> 报错 404。
     *          是因为 user-center 没有整合 actuator。
     *          解决方案：将 user-center 整合 actuator。
     *  · 04). 具体可以到 admin 控制台界面使用
     *          特殊记录一个 Logger 菜单 ，可以在控制台动态修改工程的日志级别
     *
     *  JVM监控
     *  · Spring Boot Actuator : metrics 、 heapdump 、 threaddump
     *  · java 自带的 JVM 监控工具 : jconsole 、 jvisualvm
     *
     *  日志监控
     *  · ELK : Elasticsearch + Logstash + kibana
     *      架构图查看：ELK.jpg
     *  · Spring Cloud Sleuth使用ELK收集分析日志
     *      ~ 手记：https://www.imooc.com/article/291751
     */



}
