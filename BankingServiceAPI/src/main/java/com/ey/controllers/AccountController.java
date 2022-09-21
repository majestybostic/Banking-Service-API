package com.ey.controllers;

import com.ey.models.Account;
import com.ey.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bankaccounts")
public class AccountController {

    @Autowired
    AccountService as;

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        return ResponseEntity.ok(as.getAllAccounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable int id) {
        return ResponseEntity.ok(as.getAccount(id));
    }

    @PutMapping("/{id}/deposit")
    public ResponseEntity<Account> depositById(@PathVariable int id,
                                                   @RequestParam int amount){

        try {
            //Get account
            Account account = as.getAccount(id);
            //Get the amount of specific account
            int curr_amount = account.getAmount();
            //Set the amount and incorporate the difference
            account.setAmount(curr_amount + amount);
            return ResponseEntity.ok(as.depositById(account.getId()));

        } catch (NullPointerException e) {
            System.out.println("Cannot do that!");
            return null;
        }
    }

    @PutMapping("/{id}/withdrawal")
    public ResponseEntity<Account> withdrawalById(@PathVariable int id,
                                                      @RequestParam int amount){

        try {
            //Get account
            Account account = as.getAccount(id);

            //Get the amount of specific account
            int curr_amount = account.getAmount();

            //Set the amount and incorporate the difference
            account.setAmount(curr_amount - amount);
            return ResponseEntity.ok(as.withdrawalById(account.getId()));
        } catch(NullPointerException e) {
            System.out.println("Cannot do that!");
            return null;
        }
    }


}
