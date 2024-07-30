package org.huzi.controller;

import org.huzi.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;


    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Map<String, Object>> getAll() {
        return userMapper.findAll();
    }

}
