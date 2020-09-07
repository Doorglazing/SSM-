package com.neuedu.dao;

import com.neuedu.domain.Account;

import java.sql.SQLException;
import java.util.List;

public interface IAccountDao {
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId) ;

}
