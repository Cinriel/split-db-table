采用docker进行mysql集群搭建

集群规划：mysql1主节点，mysql2和mysql3是从节点

---
主节点执行
```mysql
GRANT REPLICATION SLAVE ON *.* TO 'db_sync'@'%' IDENTIFIED by 'db_sync';
FLUSH PRIVILEGES;
show MASTER STATUS;
```
得到file与position：  

|  File |  Position   |
|-----|-----|
|   mysql-bin.000003  |   154  |

----
从节点执行
```mysql
# 先停止同步
stop SLAVE;

# 改变从库指向主库，记录上一步记录
CHANGE MASTER TO
master_host='mysql1',  #  主节点地址
master_port=3306,
master_user='db_sync',  # 主节点创建的用户名
master_password='db_sync',
master_log_file='mysql-bin.000003',  # 主节点查询到的文件名
master_log_pos=154;   # 主节点查询到的起始位置

# 启动同步
START SLAVE;

show slave STATUS;
```

结果中Slave_IO_Running与Slave_SQL_Runing必须都为Yes才表示搭建成功

