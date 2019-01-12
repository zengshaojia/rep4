package com.itheima;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class Test1 {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1(){
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }
}
