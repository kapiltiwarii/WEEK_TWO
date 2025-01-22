package LEVEL1;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Ensure bidirectional association
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
        } else {
            System.out.println("Patient " + patient.getName() + " is not under Doctor " + name + "'s care.");
        }
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Ensure bidirectional association
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");

        Patient patient1 = new Patient("John Doe");
        Patient patient2 = new Patient("Jane Doe");

        // Establish relationships
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);

        doctor2.addPatient(patient2);

        // Add to hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations
        doctor1.consult(patient1); // Expected: Doctor Dr. Smith is consulting Patient John Doe
        doctor1.consult(patient2); // Expected: Doctor Dr. Smith is consulting Patient Jane Doe
        doctor2.consult(patient1); // Expected: Patient John Doe is not under Doctor Dr. Johnson's care.
        doctor2.consult(patient2); // Expected: Doctor Dr. Johnson is consulting Patient Jane Doe
    }
}
