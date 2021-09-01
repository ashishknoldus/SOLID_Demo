package com.isp;

import java.util.List;

public class BankPayment implements Bank {

    @Override
    public void initiatePayments() {
        System.out.println("BankPayment.initiatePayments");
    }

    @Override
    public String status() {
        return "Payment is done successfully";
    }

    @Override
    public double getPayments() {
        return 50000.0;
    }
}