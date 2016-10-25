# TestSSM
第一个Spring、Spring-mvc、Mybatis框架整合，项目管理工具用的是maven

数据库信息如下：
mysql> use testssm;
Database changed
mysql> show tables;
+-------------------+
| Tables_in_testssm |
+-------------------+
| user_t            |
+-------------------+
1 row in set (0.00 sec)

mysql> desc user_t;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| id        | int(11)      | NO   | PRI | NULL    | auto_increment |
| user_name | varchar(40)  | NO   |     | NULL    |                |
| password  | varchar(255) | NO   |     | NULL    |                |
| age       | int(4)       | NO   |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+
4 rows in set (0.08 sec)

期间走的弯路有点多，感谢这位大牛的博客：http://blog.csdn.net/gebitan505/article/details/44455235/
