# TestSSM
##第一个Spring、Spring-mvc、Mybatis框架整合，项目管理工具用的是maven

##数据库信息如下：

create database testssm;

create table user_t(id int(11)  auto_increment,user_name varchar(40),password varchar(255),age int(4)，primary key (id) );


##由于本项目为maven项目，在将该项目部署到tomcat上时，需要把maven包也部署到tomcat上。
  
  操作方法：项目右键->Properties->Deployment Assembly->add->Java Bulid Path Entries->maven Dependencies.


##期间走的弯路有点多，感谢这位大牛的博客：http://blog.csdn.net/gebitan505/article/details/44455235/

