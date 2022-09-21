package com.ey.services;

import com.ey.models.Account;
import com.ey.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo ar;

    @Override
    public Account addAccount(Account a) {
        return ar.save(a);
    }

    @Override
    public Account getAccount(int id){
        return ar.findById(id).get();
    }

    @Override
    public List<Account> getAllAccounts() {
        return (List<Account>) ar.findAll();
    }

    @Override
    public Account updateAccount(Account change) {
        return ar.save(change);


    }
    @Override
    public boolean deleteAccount(int id) throws EmptyResultDataAccessException {
        try {
            ar.deleteById(id);
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<Account> getAccountById(int id) {
        return null;
    }


}
