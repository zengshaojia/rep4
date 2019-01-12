package com.itheima;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapperController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/demo")
    public List<User> findAll(){
        return userMapper.findAll();
    }
}
