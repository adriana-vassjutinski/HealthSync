package com.healthsync.model;

public class Prescription {
    private String medicationName;
    private String dosage;

    public Prescription(String medicationName, String dosage) {
        this.medicationName = medicationName;
        this.dosage = dosage;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public String getDosage() {
        return dosage;
    }
}
