package com.ey.models;


import javax.persistence.Entity;

@Entity
public class Account {

    private int id;
    private String accountNumber;
    private String BankName;
    private double currentBalance;
    private String accountName;

    public Account() {
    }



    public Account(int id, String accountNumber, String bankName, double currentBalance, String accountName) {
        this.id = id;
        this.accountNumber = accountNumber;
        BankName = bankName;
        this.currentBalance = currentBalance;
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", BankName='" + BankName + '\'' +
                ", currentBalance=" + currentBalance +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
