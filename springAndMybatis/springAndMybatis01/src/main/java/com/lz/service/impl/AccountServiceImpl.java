package com.lz.service.impl;

import com.lz.dao.AccountDao;
import com.lz.domain.Account;
import com.lz.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    public AccountDao ac;

    public void setAc(AccountDao ac) {
        this.ac = ac;
    }

    @Override
    public List<Account> findAll() {
        return ac.findAll();
    }

    @Override
    public void insertInto(Account account) {
        ac.insertInto(account);
    }
}
