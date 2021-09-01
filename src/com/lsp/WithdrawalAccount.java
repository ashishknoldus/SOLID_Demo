package com.lsp;

public class WithdrawalAccount extends Account{
    @Override
    protected void deposit(Double amount) {
        System.out.println("WithdrawalAccount :: The amount "+amount+" has been deposited into your account");
    }
    protected void withdraw(Double amount) {
        System.out.println("The amount "+amount+" has been withdrawn from your account");
    }
}
