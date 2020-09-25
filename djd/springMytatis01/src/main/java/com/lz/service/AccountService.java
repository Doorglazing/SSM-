package com.lz.service;

import com.lz.domain.Account;

import java.util.List;

public interface AccountService {
    void insert(Account account);

    List<Account> accountAll();
}
