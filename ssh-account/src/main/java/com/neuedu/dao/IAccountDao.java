package com.neuedu.dao;

import com.neuedu.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {
    @Select("select * from account")
    List<Account> findAll();

    @Update("insert into account(name, money) value (#{name}, #{money})")
    void insertInto(Account account);
}
