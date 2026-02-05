package com.healthsync.service;

import com.healthsync.model.Patient;
import com.healthsync.repository.PatientRepository;

public class HealthRecordService {

    private PatientRepository repository;

    public HealthRecordService(PatientRepository repository) {
        this.repository = repository;
    }

    public void addPatient(Patient patient) {
        repository.save(patient);
    }

    public void displayAllPatients() {
        for (Patient p : repository.findAll()) {
            System.out.println("Patient: " + p.getName() + ", Age: " + p.getAge());

            if (p.getPrescriptions() != null) {
                for (var pr : p.getPrescriptions()) {
                    System.out.println("  Prescription: " 
                            + pr.getMedicationName() 
                            + " (" + pr.getDosage() + ")");
                }
            }
        }
    }                        }
   

