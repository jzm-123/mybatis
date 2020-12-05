package com.example.mybatis;

import com.example.controller.User;
import com.example.controller.UserMapper;
import com.example.controller.p.UserMapperPrimary;
import com.example.controller.p.UserPrimary;
import com.example.controller.s.UserMapperSecondary;
import com.example.controller.s.UserSecondary;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MybatisApplicationTests {

    @Autowired
    private UserMapperPrimary userMapperPrimary;
    @Autowired
    private UserMapperSecondary userMapperSecondary;

    @Before
    public void setUp() {
        // 清空测试表，保证每次结果一样
        userMapperPrimary.deleteAll();
        userMapperSecondary.deleteAll();
    }

    @Test
    public void test() throws Exception {
        // 往Primary数据源插入一条数据
        userMapperPrimary.insert("AAA", 20);

        // 从Primary数据源查询刚才插入的数据，配置正确就可以查询到
//        UserPrimary userPrimary = userMapperPrimary.findByName("AAA");
//        Assert.assertEquals(20, userPrimary.getAge().intValue());
//
//        // 从Secondary数据源查询刚才插入的数据，配置正确应该是查询不到的
//        UserSecondary userSecondary = userMapperSecondary.findByName("AAA");
//        Assert.assertNull(userSecondary);
//
//        // 往Secondary数据源插入一条数据
//        userMapperSecondary.insert("BBB", 20);
//
//        // 从Primary数据源查询刚才插入的数据，配置正确应该是查询不到的
//        userPrimary = userMapperPrimary.findByName("BBB");
//        Assert.assertNull(userPrimary);
//
//        // 从Secondary数据源查询刚才插入的数据，配置正确就可以查询到
//        userSecondary = userMapperSecondary.findByName("BBB");
//        Assert.assertEquals(20, userSecondary.getAge().intValue());
    }

}
