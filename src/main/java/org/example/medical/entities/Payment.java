package org.example.medical.entities;

import org.example.medical.enums.PaymentMode;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    private PaymentMode mode;
    private BigDecimal amount;
    private LocalDate date;


    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
