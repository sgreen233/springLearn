package org.huzi.service.Impl;

import org.huzi.bean.User;
import org.huzi.dao.UserDao;
import org.huzi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return this.userDao.add(user);
    }

    @Override
    public int updateUser(User user) {
        return this.userDao.update(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return this.userDao.delete(id);
    }

    @Override
    public User findUserById(Integer id) {
        return this.userDao.findById(id);
    }

    @Override
    public List<Map<String,Object>> findAllUser() {
        return this.userDao.findAll();
    }
}