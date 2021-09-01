package com.lsp;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Bank.main");
        Account account= new WithdrawalAccount();
        account.deposit(50000.0);
    }
}
