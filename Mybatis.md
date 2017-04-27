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
