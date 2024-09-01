package org.example;


public class Main {

    public static void main(String[] args) {

        Payment payPalAdapter = new PayPalAdapter(new PayPal());

        Payment stripAdapter = new StripAdapter(new Strip());

        double amount = 10;
        payPalAdapter.processPayment(amount);
        stripAdapter.processPayment(amount);
    }
}