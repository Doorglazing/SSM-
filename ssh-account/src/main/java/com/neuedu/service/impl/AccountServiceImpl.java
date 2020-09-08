package com.neuedu.service.impl;

import com.neuedu.dao.IAccountDao;
import com.neuedu.domain.Account;
import com.neuedu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private IAccountDao iAccountDao ;

    @Override
    public List<Account> findAll() {
        return iAccountDao.findAll();
    }

    @Override
    public void insertInto(Account account) {
        iAccountDao.insertInto(account);
    }


}
