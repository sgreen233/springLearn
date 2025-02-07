package org.huzijdbc.dao;


import org.huzijdbc.bean.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    int add(User user);
    int update(User user);
    int delete(int id);
    List<Map<String,Object>> findAll();
    User findById(int id);
}
