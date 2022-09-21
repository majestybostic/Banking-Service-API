package com.ey.services;

import com.ey.models.Account;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {

    //Test Comment
    public Account addAccount(Account a);
    public Account getAccount(int id);
    public Account updateAccount(Account change);
    public boolean deleteAccount(int id);

    public List<Account> getAccountById(int id);

    List<Account> getAllAccounts();


}
