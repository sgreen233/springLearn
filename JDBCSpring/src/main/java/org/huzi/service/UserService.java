package org.huzi.service;

import org.huzi.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(Integer id);
    User findUserById(Integer id);
    List<Map<String,Object>> findAllUser();
}
