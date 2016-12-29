# TestSSM
###第一个Spring、Spring-mvc、Mybatis框架整合，项目管理工具用的是maven

###数据库信息如下：
```java
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| id        | int(11)     | NO   | PRI | NULL    | auto_increment |
| user_name | varchar(40) | NO   |     | NULL    |                |
| password  | varchar(40) | NO   |     | NULL    |                |
| age       | int(4)      | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
```

#注：
###1、使用mybatis generator自动生成Mybatis表实体、接口、配置文件
- 1、下载相关包及配置ganeratorConfig.xml配置文件，将相关包拷贝到项目根目录下：</br>
相关包有：mybatis-3.2.6.jar、mybatis-generator-core-1.3.2.jar、mysql-generator-java-5.1.7-bin.jar
- 2、ganeratorConfig.xml文件配置如下：
```java
<?xml version="1.0" encoding="UTF-8"?>    
<!DOCTYPE generatorConfiguration    
  PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"    
  "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">    
<generatorConfiguration>    
<!-- 数据库驱动-->    
    <classPathEntry  location="mysql-connector-java-5.1.7-bin.jar"/>    
    <context id="DB2Tables"  targetRuntime="MyBatis3">    
        <commentGenerator>    
            <property name="suppressDate" value="true"/>    
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->    
            <property name="suppressAllComments" value="true"/>    
        </commentGenerator>    
        <!--数据库链接URL，用户名、密码 -->    
        <jdbcConnection driverClass="com.mysql.jdbc.Driver" connectionURL="jdbc:mysql://127.0.0.1:3306/testssm" userId="xxx" password=xxxx">    
        </jdbcConnection>    
        <javaTypeResolver>    
            <property name="forceBigDecimals" value="false"/>    
        </javaTypeResolver>    
        <!-- 生成模型的包名和位置-->    
        <javaModelGenerator targetPackage="test.domain" targetProject="src">    
            <property name="enableSubPackages" value="true"/>    
            <property name="trimStrings" value="true"/>    
        </javaModelGenerator>    
        <!-- 生成映射文件的包名和位置-->    
        <sqlMapGenerator targetPackage="test.mapping" targetProject="src">    
            <property name="enableSubPackages" value="true"/>    
        </sqlMapGenerator>    
        <!-- 生成DAO的包名和位置-->    
        <javaClientGenerator type="XMLMAPPER" targetPackage="test.IDao" targetProject="src">    
            <property name="enableSubPackages" value="true"/>    
        </javaClientGenerator>    
        <!-- 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名-->    
        <table tableName="user_t" domainObjectName="User" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"></table>  
    </context>    
</generatorConfiguration> 
```
- 3、在项目根目录下运行cmd命令：
```java
Java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
```
-执行成功后即可生成相应表对应的实体、接口和xml配置文件
###2、由于本项目为maven项目，在将该项目部署到tomcat上时，需要把maven包也部署到tomcat上。
  
  -操作方法：项目右键->Properties->Deployment Assembly->add->Java Bulid Path Entries->maven Dependencies.

###期间走的弯路有点多，感谢这位大牛的博客：http://blog.csdn.net/gebitan505/article/details/44455235/

