package com.lsp;

public class FDAccount extends Account{
    @Override
    protected void deposit(Double amount) {
        System.out.println("FDAccount :: The amount "+amount+" has been deposited into your account");
    }
}
