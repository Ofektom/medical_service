package org.example.medical.entities;

import org.example.medical.enums.BloodGroup;

import java.math.BigDecimal;
import java.util.List;

public abstract class User {
    private String name;
    private String age;
    private String gender;
    private String role;
    private String address;
    private Long phoneNumber;
    private String weight;
    private String genoType;
    private String nextOfKin;
    //Association and Aggregation (is and has a relationship)
    private List<Allergies> allergies;
    private BloodGroup bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGenoType() {
        return genoType;
    }

    public void setGenoType(String genoType) {
        this.genoType = genoType;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public List<Allergies> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergies> allergies) {
        this.allergies = allergies;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
