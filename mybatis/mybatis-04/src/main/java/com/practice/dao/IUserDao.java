package com.practice.dao;


import com.practice.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    @Select("select * from user where id = 41")
    List<User> findALL();

}
