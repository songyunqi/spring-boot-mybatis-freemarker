package com.foo.controller;

import com.foo.form.UserQueryForm;
import com.foo.mapper.UserMapper;
import com.foo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserMapper userMapper;

    @RequestMapping("queryByName")
    public User queryByName(String name) {
        User user = userMapper.queryByName(name);
        return user;
    }

    @RequestMapping("queryByForm")
    public User queryByForm(UserQueryForm form) {
        User user = userMapper.queryByForm(form);
        return user;
    }
}
