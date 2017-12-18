-- create database self;
use self;

drop table if exists t_shop;
create table t_shop (
    shop_id int(12) not null auto_increment primary key,
    shop_name varchar(32) default null,
    shop_city varchar(12) default null,
    shop_address varchar(32) default null,
    create_at timestamp default current_timestamp,
    update_at timestamp default current_timestamp,
    delete_flag varchar(10) default 'N'
) engine=InnoDB default charset=utf8;

drop table if exists t_goods;
create table t_goods (
    goods_id int(12) not null auto_increment primary key,
    shop_id int,
    goods_name varchar(32) default null,
    goods_desc varchar(32) default null,
    create_at timestamp default current_timestamp,
    update_at timestamp default current_timestamp,
    delete_flag varchar(10) default 'N',
    foreign key(shop_id) references t_shop(shop_id)
) engine=InnoDB default charset=utf8;

drop table if exists t_hotel;
create table t_hotel (
  hotel_id int(12) not null auto_increment primary key,
  hotel_name varchar(32) default null,
  hotel_price varchar(32) default null,
  checkin_time timestamp default current_timestamp,
  create_at timestamp default current_timestamp,
  update_at timestamp default current_timestamp,
  delete_flag varchar(10) default 'N'
) engine=InnoDB default charset=utf8;