package com.neuedu.service;

import com.neuedu.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void insertInto(Account account);
}
