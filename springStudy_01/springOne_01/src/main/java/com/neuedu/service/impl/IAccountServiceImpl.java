package com.neuedu.service.impl;

import com.neuedu.dao.IAccountDao;
import com.neuedu.dao.impl.IAcountDaoImpl;
import com.neuedu.domain.Account;
import com.neuedu.service.IAccountService;

import java.util.List;

public class IAccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;
    public void setAccountDao(IAcountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
