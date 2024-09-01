package org.example;

public class StripAdapter implements Payment {

    public Strip strip;

    public StripAdapter(Strip strip) {
        this.strip = strip;
    }

    @Override
    public void processPayment(double amount) {
        strip.makePayment(amount);
    }
}
