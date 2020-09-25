package com.lz.dao;

import com.lz.domain.Account;

import java.util.List;

public interface AccountDao {
    void insert(Account account);
    List<Account> accountAll();
}
