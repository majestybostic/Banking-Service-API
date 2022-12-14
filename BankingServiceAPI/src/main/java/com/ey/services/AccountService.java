package com.ey.services;

import com.ey.models.Account;
import com.ey.models.User;
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

    List<Account> getAllAccounts();

    Account depositById(int id);
    Account withdrawalById(int id);

   List<Account> transfer(int fromThisBank, int toThisBank);

    public User getUserByBankId(int id);


}
