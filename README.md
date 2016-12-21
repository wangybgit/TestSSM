# TestSSM
###第一个Spring、Spring-mvc、Mybatis框架整合，项目管理工具用的是maven

###数据库信息如下：

+-----------+-------------+------+-----+---------+----------------+</br>
| Field     | Type        | Null | Key | Default | Extra          |</br>
+-----------+-------------+------+-----+---------+----------------+</br>
| id        | int(11)     | NO   | PRI | NULL    | auto_increment |</br>
| user_name | varchar(40) | NO   |     | NULL    |                |</br>
| password  | varchar(40) | NO   |     | NULL    |                |</br>
| age       | int(4)      | YES  |     | NULL    |                |</br>
+-----------+-------------+------+-----+---------+----------------+</br>



###由于本项目为maven项目，在将该项目部署到tomcat上时，需要把maven包也部署到tomcat上。
  
  操作方法：项目右键->Properties->Deployment Assembly->add->Java Bulid Path Entries->maven Dependencies.


###期间走的弯路有点多，感谢这位大牛的博客：http://blog.csdn.net/gebitan505/article/details/44455235/

