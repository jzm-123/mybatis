package com.example.controller;

import org.apache.ibatis.annotations.*;

import java.util.Map;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME =#{name}")
    User findByName(@Param("name") String name);
    @Insert("INSERT INTO USER(NAME,AGE) VALUES(#{name},#{age})")
    int insertByUser(User user);//返回要么是0或1
    @Delete("DELETE FROM user WHERE id=#{id}")
    void delete(Long id);
    @Update("UPDATE user SET age=#{age} WHERE name=#{name}")
    void update(User user);
//    int insert(@Param("name") String name,@Param("age") Integer age);
//    @Insert("INSERT INTO USER(NAME,AGE) VALUES(#{name,jdbcType=VARCHAR},#{age,jdbcType=INTEGER})")
//    int insertByMap(Map<String,Object> map);
}
