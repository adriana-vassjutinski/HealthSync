package com.healthsync.repository;

import com.healthsync.model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
    private List<Patient> patients = new ArrayList<>();

    public void save(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> findAll() {
        return patients;
    }
}
