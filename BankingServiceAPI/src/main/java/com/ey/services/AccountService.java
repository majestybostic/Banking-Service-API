package com.ey.services;

import com.ey.models.Account;

import java.util.List;

public interface AccountService {

    //Test Comment
    public Account addAccount(Account a);
    public Account getAccount(int id);
    public Account updateAccount(Account change);
    public boolean deleteAccount(int id);

    public List<Account> getAccountById(int id);
}
