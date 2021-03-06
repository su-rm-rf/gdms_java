需求
----
    商品信息管理系统
        维护商铺信息
        维护商品信息
        维护酒店信息
    
表结构
----
    shop( shop_id, shop_name, shop_city, shop_address )
    goods( goods_id, shop_id, goods_name, goods_desc )
    hotel( hotel_id, hotel_name, hotel_price, hotel_checkin_date, hotel_has_breakfast )

- [建表语句](gdms-biz/src/main/resources/sql/shop_goods.sql)
    
工程模块结构
----
    gdms_java
        gdms-facade
        gdms-biz
        gdms-web
    
工程模块结构详解
----
    facade
        src/main/java
            bo 接口
            dto
            service 接口
            util 工具类
    biz
        src/main/java
            bo 实现类
            dao 接口
            entity 实体类
            service 实现类
        src/main/resources
            applicationContext.xml
            jdbc.properties
        src/test/java
    web
        src/main/java
            common
                filter
                error
                interceptor
            controller
        src/main/resources
            servlet.xml
            log4j.properties
        src/test/java
        src/main/webapp
            web.xml
        
模块依赖关系
----
    biz -> facade
    web -> facade, biz

配置Spring
----
    IOC
    AOP
    注解: @Service
    
MyBatis
----
    创建数据库和表
    根据表反向生成Model、DAO、mapping语句
    
配置SpringMVC
----
    DispatcherServlet
    注解: @Contrller, @RequestMapping, @Resource
    
- [相关知识点](Java.md)
- [mybatis generator with maven](http://www.mybatis.org/generator/running/runningWithMaven.html)
