商品信息管理系统
    维护商铺信息
    维护商品信息
    
表结构
    shop( shop_id, shop_name, shop_city, shop_address )
    goods( goods_id, shop_id, goods_name, goods_desc )
    
工程结构
    facade
        src/main/java
            bo 接口
            dto
            service 接口
    biz
        src/main/java
            bo 实现类
            dao 接口
            dao 实现类
            entity 实体类
            service 实现类
        src/main/resources
            applicationContext.xml
            jdbc.properties
        src/test/java
    web
        src/main/java
            filter
            controller
        src/main/resources
            servlet.xml
            log4j.properties
        src/test/java
        
模块依赖关系
    biz -> facade
    web -> facade, biz

配置Spring
    IOC
    AOP
配置Hibernate
    dataSource
    sessionFactory
    transactionManager
配置SpringMVC
    DispatcherServlet
    RequestBody, ResponseBody
    