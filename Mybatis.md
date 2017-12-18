mybatis-generator自动生成
	先在数据库中创建表，然后执行mybatis-generator:generate，自动生成了model,dao,mapper.xml文件
	可以手动添加dao和mapping条目

条件查询
----
```markdown
    <where>
        true
        <if test="xxx">
            and key1 like concat(concat('%', #{key11}, '%'))
        </if>
        and delete_flag = 'N'
    </where>
```
