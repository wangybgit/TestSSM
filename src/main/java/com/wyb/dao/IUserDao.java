package com.wyb.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wyb.domain.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User findUserByNameAndPsw(@Param("map") Map<String,String> map);

    User findUserByUserName(String username);
}