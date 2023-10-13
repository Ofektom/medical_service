package org.example.medical.services;

import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.entities.Patient;
import org.example.medical.entities.Receipt;
import org.example.medical.enums.PaymentStatus;

public interface DoctorServices {
    Patient discharge(Patient patient, Receipt receipt);
    void consult();
    void admit(Patient patient);
    void prescribe();
    void requestInvestigation();
    void diagnosePatient(Patient patient, MedicalPersonnel doctor);
}
