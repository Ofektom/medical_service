package org.example;

import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.entities.Patient;
import org.example.medical.entities.Payment;
import org.example.medical.entities.Receipt;
import org.example.medical.enums.PaymentMode;
import org.example.medical.enums.PaymentStatus;
import org.example.medical.enums.Role;
import org.example.medical.serviceImpl.DoctorServicesImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        MedicalPersonnel doctor = new MedicalPersonnel();
        Patient patient1 = new Patient();
        Receipt receipt = new Receipt();
        Payment payment = new Payment();
        BigDecimal amount = new BigDecimal("5000.23");

        payment.setMode(PaymentMode.CARD);
        payment.setAmount(amount);

        doctor.setName("Ndanti William");
        doctor.setGrade("Surgical");
        doctor.setRole(Role.DOCTOR);

        patient1.setName("Eyo Ekpenyong");
        patient1.setDiagnosis("Malaria");
        patient1.setLastPrescription("Amala");
        patient1.setLAST_APPOINTMENT(LocalDateTime.now());

        receipt.setDescription("Treatment");
        receipt.setPatient(patient1);
        receipt.setPaymentDetails(payment);
        receipt.setStatus(PaymentStatus.CLEARED);

        DoctorServicesImpl med  = new DoctorServicesImpl();
        med.admit(patient1);
        med.diagnosePatient(patient1, doctor);
        System.out.println(med.discharge(patient1, receipt).getName());
    }
}