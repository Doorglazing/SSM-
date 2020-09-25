package com.lz.dao;

import com.lz.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();

    void insertInto(Account account);
}
