package com.neusoft.dao;

import com.neusoft.domain.User;

import java.io.Serializable;
import java.util.List;

public interface IUserDao {
    // 查询所有
    List<User> findAll();

    // 按id查询
    List<User> findById(int id);

    // 插入并返回插入的id
    int insertInto(User user);

    // 更改
    int updateUser(User user);

    //
    int deleteUser(Integer id);

    // 模糊查询
    List<User> LikeUser(String username);
    // 查询行数
    int countTotal();

}
