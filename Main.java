package com.healthsync.main;

import com.healthsync.model.Patient;
import com.healthsync.model.Prescription;
import com.healthsync.repository.PatientRepository;
import com.healthsync.service.HealthRecordService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PatientRepository repository = new PatientRepository();
        HealthRecordService service = new HealthRecordService(repository);

        Prescription p1 = new Prescription("Ibuprofen", "200mg");
        Patient patient = new Patient(
                "P001",
                "John Doe",
                30,
                Arrays.asList(p1)
        );

        service.addPatient(patient);
        service.displayAllPatients();
    }
}
