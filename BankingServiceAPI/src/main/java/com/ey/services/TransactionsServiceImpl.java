package com.ey.services;

import com.ey.models.Transactions;
import com.ey.repositories.TransactionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    TransactionsRepo transactionsRepo;


    @Override
    public List<Transactions> getAllTransactions() {
        return (List<Transactions>) transactionsRepo.findAll();
    }

    @Override
    public Transactions addTransactions(Transactions t) {
        Date currentDate = new Date(t.getCompletionDate());
        return transactionsRepo.save(t);


    }

    @Override
    public Transactions getTransactions(int id) {
        return null;
    }

    @Override
    public Transactions getTransactionsById(int id) {
        return null;
    }


    @Override
    public Transactions updateTransactions(Transactions change) {
        return null;
    }

    @Override
    public boolean deleteTransactions(int id) {
        return false;
    }


}




