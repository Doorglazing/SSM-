package com.lz.service.impl;

import com.lz.dao.AccountDao;
import com.lz.domain.Account;
import com.lz.service.AccountService;

import java.util.List;

public class AccountImpl implements AccountService {

    private AccountDao accountDao ;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void insert(Account account) {
        accountDao.insert(account);
    }

    @Override
    public List<Account> accountAll() {
        return accountDao.accountAll();
    }
}
