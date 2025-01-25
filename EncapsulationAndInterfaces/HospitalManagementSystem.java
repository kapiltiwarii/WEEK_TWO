// Abstract class representing a Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();
}

// Interface for managing medical records
interface MedicalRecord {
    void addRecord(String record);

    String viewRecords();
}

// Subclass representing an In-Patient
class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int numberOfDays;
    private String diagnosis;
    private String medicalHistory;

    private StringBuilder records = new StringBuilder();

    public InPatient(String patientId, String name, int age, double roomChargePerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * numberOfDays;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }

    // Encapsulated methods to handle sensitive patient data
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

// Subclass representing an Out-Patient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;
    private String medicalHistory;

    private StringBuilder records = new StringBuilder();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }

    // Encapsulated methods to handle sensitive patient data
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

// Main class to demonstrate the Hospital Patient Management System
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating an In-Patient
        InPatient inPatient = new InPatient("P001", "John Doe", 35, 500.0, 5);
        inPatient.setDiagnosis("Pneumonia");
        inPatient.setMedicalHistory("Asthma");
        inPatient.addRecord("Admitted on Jan 20, 2025");
        inPatient.addRecord("Treated with antibiotics");

        // Creating an Out-Patient
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 28, 100.0);
        outPatient.setDiagnosis("Flu");
        outPatient.setMedicalHistory("No prior conditions");
        outPatient.addRecord("Consulted on Jan 21, 2025");
        outPatient.addRecord("Prescribed antiviral medication");

        // Displaying patient details and bills
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Diagnosis: " + inPatient.getDiagnosis());
        System.out.println("Medical History: " + inPatient.getMedicalHistory());
        System.out.println("Medical Records:\n" + inPatient.viewRecords());
        System.out.println("Total Bill (In-Patient): $" + inPatient.calculateBill());

        System.out.println();

        System.out.println(outPatient.getPatientDetails());
        System.out.println("Diagnosis: " + outPatient.getDiagnosis());
        System.out.println("Medical History: " + outPatient.getMedicalHistory());
        System.out.println("Medical Records:\n" + outPatient.viewRecords());
        System.out.println("Total Bill (Out-Patient): $" + outPatient.calculateBill());
    }
}
