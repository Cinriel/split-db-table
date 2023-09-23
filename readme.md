# 数据库分库分表

## 1.horizon-split-table 水平分表
实现了自定义主键
在resource下新建 `META-INF/services/org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator`，内容是自定义生成主键类（实现ShardingKeyGenerator接口）

## 2.horizon-split-db 水平分库
把同一个表的数据按照一定的规则拆到不用的数据

## 3.vertical-split-db 垂直分库
当插入数据到指定表时，路由到对应的数据库

## 4.public-table 公共表
公共表，所有数据库都存在的一张表（t_dict）
插入/删除数据时，所有库的表同时更改

## 5.read-write-split 读写分离
搭建主从集群