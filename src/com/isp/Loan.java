package com.isp;

public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}