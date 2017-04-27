hibernate缓存
----
    二级缓存
    查询缓存

乐观锁、悲观锁
----

Spring事务控制
----
    切面拦截
    异常事务回滚

相关知识点
----
```markdown
    hibernate创建原生的查询语句
        createNativeQuery(sql, XX.class)
    
    日志
        继承 OncePerRequestFilter
        
    跨域
        继承 javax.servlet.Filter
        
    定义错误返回信息
        ShopErrorMsg
        
    设置逻辑删除标识
        delete_flag
        
    Controller返回JSON数据
            ResponseBody
        
    路径变量
        @PataVariable Type name
        
    mac下mysql中文乱码
    
    修改 idea 工程的Java语言级别
    修改 Java Compiler版本

    
    BO调用DAO、BO
    Service调用BO

```
mybatis
----
```markdown
    打印sql语句
        配置logImpl
    时间戳
        current_timestamp
```

mysql
----
```markdown
    三范式:

    字段约束:
        null 和 not null: 字段的值为空或不能为空
        default: 字段的默认值，加上引号
        auto_increment: 主键自增
        外键: foreign key( key1 ) references tabel2( key2 )
    
    设置了默认值，但传入的值为null，结果仍然为null
    时间戳默认值: current_timestamp
```

参考内容
----
- [hibernate5原生SQL查询](http://www.cnblogs.com/miller-zou/p/5720048.html)
- [mac下mysql中文乱码](http://www.2cto.com/database/201110/108470.html)