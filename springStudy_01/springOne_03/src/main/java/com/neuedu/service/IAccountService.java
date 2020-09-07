package com.neuedu.service;

import com.neuedu.domain.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);
}
