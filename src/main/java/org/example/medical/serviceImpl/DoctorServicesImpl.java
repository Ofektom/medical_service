package org.example.medical.serviceImpl;

import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.entities.Patient;
import org.example.medical.entities.Receipt;
import org.example.medical.enums.PaymentStatus;
import org.example.medical.services.DoctorServices;


public class DoctorServicesImpl implements DoctorServices{
    @Override
    public Patient discharge(Patient patient, Receipt receipt) {
        if (receipt.getStatus().equals(PaymentStatus.CLEARED)){
            return patient;
        }
       return null;
    }
    @Override
    public void consult(){

    }
    @Override
    public void admit(Patient patient) {
        Patient.listOfPatient.add(patient);
    }
    @Override
    public void prescribe(){

    }
    @Override
    public void requestInvestigation(){

    }
    @Override
    public void diagnosePatient(Patient patient, MedicalPersonnel doctor) {
        System.out.println( doctor.getRole() + "  " + doctor.getName() + " is responsible for the patient with details: ");
        System.out.println(patient);
    }
}
