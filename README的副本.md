java-as-server

项目需求
---
```markdown
酒店列表查询      /hotel/list
酒店详情         /hotel/:id
酒店预订         /hotel/neworder
酒店订单详情      /hotel/order/:id
```

数据库
---
```markdown
Hotel {
  id String,
  name String,
  date String,
  price String,
  hasBreakfast Boolean
}

Order {
  id String,
  amount String,
  hotelId String
}

Query {
  from String,
  to String,
  start String,
  end String,
}
```

项目结构
---
```markdown
root
	facade
		dto
		service
	biz
		model
		serviceimpl
		dao
		mapping.xml
	web
		controller
```
