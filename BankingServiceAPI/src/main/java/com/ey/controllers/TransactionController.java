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

@RestController
@RequestMapping("transactions")
public class TransactionController {

    @Autowired
    TransactionsService ts;

    @GetMapping("/{id}")
    public ResponseEntity<Transactions> getTransactionsById(@PathVariable int id) {
        return ResponseEntity.ok(ts.getTransactions(id));
    }

    @GetMapping
    public ResponseEntity<List<Transactions>> getAllTransactions(){
        return ResponseEntity.ok(ts.getAllTransactions());
    }

/////Automatically adds transactions as they are done so we do not need to manually add them
//    @PostMapping
//    public ResponseEntity<Transactions> addTransactions(Transactions t) {
//        Transactions newTransactions = new Transactions();
//
//        return ResponseEntity.ok(ts.addTransactions(newTransactions));
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Transactions> deleteTransactions(@PathVariable int id){
        return ResponseEntity.ok(ts.deleteTransactions(id));
    }

    }

