package org.huzijdbc.controller;


import org.huzijdbc.bean.User;
import org.huzijdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/querystudent", method = RequestMethod.GET)
    public User queryStudentBySno(int id) {
        return this.userService.findUserById(id);
    }

    @RequestMapping(value = "/queryallstudent")
    public List<Map<String, Object>> queryAllStudent() {
        return this.userService.findAllUser();
    }

    @RequestMapping(value = "/addstudent", method = RequestMethod.GET)
    public int saveStudent(int id,String name,int sex) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSex(sex);
        return this.userService.addUser(user);
    }

    @RequestMapping(value = "deletestudent", method = RequestMethod.GET)
    public int deleteStudentBySno(int id) {
        return this.userService.deleteUser(id);
    }

}
