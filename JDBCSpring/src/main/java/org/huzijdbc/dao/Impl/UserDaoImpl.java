package org.huzijdbc.dao.Impl;

import org.huzijdbc.bean.User;
import org.huzijdbc.dao.UserDao;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.huzijdbc.mapper.UserMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Repository("studentDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user) {
        String sql = "insert into user(id,name,age,sex) values(:id,:name,:age,:sex)";
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
        return npjt.update(sql, new BeanPropertySqlParameterSource(user));
    }

    @Override
    public int update(User user) {
        String sql = "update user set name=?,age=? sex=? where id=?";
        Object[] params = {user.getName(),user.getAge(),user.getSex(),user.getId()};
        int[] argTypes = {Types.VARCHAR, Types.INTEGER, Types.INTEGER, Types.INTEGER};
        return this.jdbcTemplate.update(sql, params, argTypes);
    }

    @Override
    public int delete(int id) {
        String sql = "delete from user where id=:id";
        NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
        return npjt.update(sql, new MapSqlParameterSource("id", id));
    }

    @Override
    public List<Map<String, Object>> findAll() {
        String sql = "select * from user";
        return this.jdbcTemplate.queryForList(sql);
    }

    @Override
    public User findById(int id) {
        String sql = "select * from user where id = ?";
        Object[] args = { id };
        int[] argTypes = { Types.VARCHAR };
        List<User> userList = this.jdbcTemplate.query(sql, args, argTypes, new UserMapper());
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }
}
