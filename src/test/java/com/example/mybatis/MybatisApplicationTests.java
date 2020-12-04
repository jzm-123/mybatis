package com.example.mybatis;

import com.example.controller.User;
import com.example.controller.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    @Rollback
    void contextLoads() {
//        Map<String,Object> map=new HashMap<>();
//        map.put("name","BBB");
//        map.put("age",1);
//        User u=new User("EEEE",80);
//        userMapper.insertByUser(u);
//        User a= userMapper.findByName("AAA");
//        Assert.assertEquals(30,a.getAge().intValue());
//        a.setAge(30);
//        userMapper.update(a);
//        User a=new User("EEEE",25);
//        userMapper.insertByUser(a);
        User u=userMapper.findByName("EEEE");
        userMapper.delete(u.getId());

    }

}
