package LEVEL1;

public class Patient {
    static String hospitalName = " CITY HOSPITAL ";
    final String patientID;
    String name;
    int age;
    String ailment;
    static int totalPatient = 0;

    //Constuctor to initialise the patient detail
    Patient(String patientID,String name,int age,String ailment){
        this.patientID=patientID;
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        totalPatient++;
    }

    // Method to get total patient
    static  int getTotalPatient(){
        return totalPatient;
    }

    //Method to display patient detail
    void displayPatientDetail(){
        if (this instanceof Patient){
            System.out.println("Patient ID :"+patientID);
            System.out.println("Patient Name :"+name);
            System.out.println("Patient age :"+age);
            System.out.println("Patient Ailment :"+ailment);
        }
        else {
            System.out.println("This does not belong to the instanse of Patient Class");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("P-013","Mayank",22,"Jaundice");
        Patient patient2 = new Patient("P-115","Priyanshu",23,"Malaria");

        // Calling display function using objects
        patient1.displayPatientDetail();
        patient2.displayPatientDetail();

        // Calling get total patient
        System.out.println("Total Patient :"+  Patient.getTotalPatient());

    }
}
