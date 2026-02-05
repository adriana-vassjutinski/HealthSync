package com.healthsync.model;

import java.util.List;

public class Patient {
    private String patientId;
    private String name;
    private int age;
    private List<Prescription> prescriptions;

    public Patient(String patientId, String name, int age, List<Prescription> prescriptions) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.prescriptions = prescriptions;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }
}
