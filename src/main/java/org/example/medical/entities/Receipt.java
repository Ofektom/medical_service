package org.example.medical.entities;


import org.example.medical.enums.PaymentStatus;

public class Receipt {
    private Patient patient;
    private String description;
    private Payment paymentDetails;
    private PaymentStatus status;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Payment getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(Payment paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "patient=" + patient +
                ", description='" + description + '\'' +
                ", paymentDetails=" + paymentDetails +
                ", status=" + status +
                '}';
    }
}
