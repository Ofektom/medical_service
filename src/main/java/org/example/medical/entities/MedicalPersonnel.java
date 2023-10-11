package org.example.medical.entities;

import org.example.medical.enums.Role;

import java.math.BigDecimal;

public class MedicalPersonnel extends User{

    private String specialization;
    private String schedule;
    private String grade;
    private BigDecimal salary;
    private Role role;

    public MedicalPersonnel() {
    }

    public MedicalPersonnel(String specialization, String schedule, String grade, BigDecimal salary, Role role) {
        this.specialization = specialization;
        this.schedule = schedule;
        this.grade = grade;
        this.salary = salary;
        this.role = role;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return role.name();
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
