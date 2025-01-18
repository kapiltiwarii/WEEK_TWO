public class Person {
    String name;
    int age;
    String religion;

    // Default constructor is declared 
    public Person(){
       this.name="Kapil";
       this.age=20;
       this.religion="Hindu";
    }

    // Parameterise constructor is declared
    public Person(Person result){
        this.name=result.name;
        this.age=result.age;
        this.religion=result.religion;
    }

    // method to display person detail

    void display(){
        System.out.println("Person name : "+name);
        System.out.println("Person age : "+age);
        System.out.println("Person religion : "+religion);
    }

    public static void main(String[] args) {
          Person result = new Person();
          result.display();

          Person copyResult = new Person(result);
           copyResult.display();

    }
}
