public class Employee {
    String name;
    String id;
    int salary;
    // Constructor is declared 
    Employee(String name,String id,int salary){
     this.name = name;
     this.id= id;
     this.salary = salary;
   }
   // Method to display details 
   void displayEmployeeDetail(){
    System.out.println("Name :"+name);
    System.out.println("Employee ID :"+id);
    System.out.println("Salary :"+salary);
   }
   public static void main(String[] args) {
    //creating object
    Employee details = new Employee("Kapil ", "0111it211053", 28000);
    //calling displayEmployeeDetail() method
    details.displayEmployeeDetail();
   }
}
