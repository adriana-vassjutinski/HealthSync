# HealthSync

## Overview

HealthSync is a Java-based academic software engineering project that demonstrates object-oriented programming through a simple health-record management application.

The project focuses on organizing patient and prescription information using separate model, repository, and service components. It was developed as a learning project to practice Java programming and basic software architecture.

## Technologies

- Java
- Object-oriented programming (OOP)

## Project Structure

| File | Purpose |
| --- | --- |
| `Main.java` | Application entry point |
| `Patient.java` | Patient data model |
| `Prescription.java` | Prescription data model |
| `PatientRepository.java` | Component responsible for patient data management |
| `HealthRecordService.java` | Service component for health-record operations |

## Software Design

The application separates responsibilities across different Java classes:

- **Models:** Represent patient and prescription information.
- **Repository:** Organizes access to patient-related data.
- **Service:** Contains application-level health-record operations.
- **Main:** Provides the entry point for the program.

This structure demonstrates basic separation of concerns and object-oriented software design.

## Running the Project

The project consists of Java source files. To run it locally:

1. Install a Java Development Kit (JDK).
2. Download or clone the repository.
3. Open the project directory in a terminal or Java IDE.
4. Compile the Java files using `javac *.java`.
5. Run the application using `java Main`.

These commands assume a standard JDK installation and Java classes without package declarations.

## Project Scope

HealthSync is an educational project created to demonstrate Java programming, class organization, and basic health-record management concepts.

It is not intended for clinical use or production deployment and should not be used to store real patient information.
