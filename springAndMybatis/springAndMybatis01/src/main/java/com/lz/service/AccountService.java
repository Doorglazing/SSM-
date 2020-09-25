package com.lz.service;

import com.lz.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void insertInto(Account account);
}
