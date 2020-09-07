package com.neuedu.dao;

import com.neuedu.domain.Account;
import com.neuedu.domain.AccountUser;

import java.util.List;

public interface AccountUserDao {
    List<Account> findAll();

    List<AccountUser> findAllAccountUser();
}
