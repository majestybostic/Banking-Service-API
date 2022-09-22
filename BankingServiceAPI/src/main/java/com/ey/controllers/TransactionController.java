package com.ey.controllers;

import com.ey.models.Account;
import com.ey.models.Transactions;
import com.ey.models.User;
import com.ey.services.AccountService;
import com.ey.services.TransactionsService;
import com.ey.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionController {

    @Autowired
    TransactionsService as;

    @GetMapping
    public ResponseEntity<List<Transactions>> getTransactions() {
        return ResponseEntity.ok(as.getAllTransactions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transactions> getTransactionsById(@PathVariable int id) {
        return ResponseEntity.ok(as.getTransactions(id));
    }

    @Autowired
    TransactionsService us;

    @GetMapping
    public ResponseEntity<List<Transactions>> getAllTransactions(){
        return ResponseEntity.ok(us.getAllTransactions());
    }


    @PostMapping
    public ResponseEntity<Transactions> addTransactions(Transactions t) {

        Transactions newTransactions = new Transactions();
 //       newTransactions.setStartDate(System.currentTimeMillis().toString());
 //       newTransactions.setCompletionDate(System.currentTimeMillis());
        return ResponseEntity.ok(us.addTransactions(newTransactions));
    }

    }

