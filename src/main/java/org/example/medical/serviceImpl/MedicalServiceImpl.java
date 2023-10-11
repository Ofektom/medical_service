package org.example.medical.serviceImpl;

import org.example.Main;
import org.example.medical.entities.MedicalPersonnel;
import org.example.medical.entities.Patient;
import org.example.medical.services.MedicalServices;

public class MedicalServiceImpl implements MedicalServices {

    @Override
    public Patient discharge() {
        return null;
    }

    @Override
    public void admit(Patient patient) {
        Patient.listOfPatient.add(patient);
    }

    @Override
    public void diagnosePatient(Patient patient, MedicalPersonnel doctor) {

    }
}
