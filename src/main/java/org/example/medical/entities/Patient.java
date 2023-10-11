package org.example.medical.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Patient extends User{
    public static List<Patient> listOfPatient = new ArrayList<>();

    private String diagnosis;
    private LocalDateTime LAST_APPOINTMENT;
    private LocalDateTime NEXT_APPOINTMENT;
    private String lastPrescription;
    private String doctorName;
}
