package org.example.medical.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Patient extends User{
    public static List<Patient> listOfPatient = new ArrayList<>();

    private String diagnosis;
    private LocalDateTime LAST_APPOINTMENT;
    private LocalDateTime NEXT_APPOINTMENT;
    private String lastPrescription;
    private String doctorName;

    public Patient() {
    }

    public Patient(String diagnosis, LocalDateTime LAST_APPOINTMENT, LocalDateTime NEXT_APPOINTMENT, String lastPrescription, String doctorName) {
        this.diagnosis = diagnosis;
        this.LAST_APPOINTMENT = LAST_APPOINTMENT;
        this.NEXT_APPOINTMENT = NEXT_APPOINTMENT;
        this.lastPrescription = lastPrescription;
        this.doctorName = doctorName;
    }

    public static List<Patient> getListOfPatient() {
        return listOfPatient;
    }

    public static void setListOfPatient(List<Patient> listOfPatient) {
        Patient.listOfPatient = listOfPatient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDateTime getLAST_APPOINTMENT() {
        return LAST_APPOINTMENT;
    }

    public void setLAST_APPOINTMENT(LocalDateTime LAST_APPOINTMENT) {
        this.LAST_APPOINTMENT = LAST_APPOINTMENT;
    }

    public LocalDateTime getNEXT_APPOINTMENT() {
        return NEXT_APPOINTMENT;
    }

    public void setNEXT_APPOINTMENT(LocalDateTime NEXT_APPOINTMENT) {
        this.NEXT_APPOINTMENT = NEXT_APPOINTMENT;
    }

    public String getLastPrescription() {
        return lastPrescription;
    }

    public void setLastPrescription(String lastPrescription) {
        this.lastPrescription = lastPrescription;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                ", LAST_APPOINTMENT=" + LAST_APPOINTMENT +
                ", NEXT_APPOINTMENT=" + NEXT_APPOINTMENT +
                ", lastPrescription='" + lastPrescription + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(diagnosis, patient.diagnosis) && Objects.equals(LAST_APPOINTMENT, patient.LAST_APPOINTMENT) && Objects.equals(NEXT_APPOINTMENT, patient.NEXT_APPOINTMENT) && Objects.equals(lastPrescription, patient.lastPrescription) && Objects.equals(doctorName, patient.doctorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagnosis, LAST_APPOINTMENT, NEXT_APPOINTMENT, lastPrescription, doctorName);
    }
}
