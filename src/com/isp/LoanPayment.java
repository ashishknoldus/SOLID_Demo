package com.isp;

import java.util.List;

public class LoanPayment implements Loan {

    @Override
    public void initiateLoanSettlement() {
        System.out.println("LoanPayment.initiateLoanSettlement");
    }

    @Override
    public void initiateRePayment() {
        System.out.println("LoanPayment.initiateRePayment");
    }

    @Override
    public String status() {
        return "Loan is approved";
    }

    @Override
    public double getPayments() {
        return 100000.0;
    }
}