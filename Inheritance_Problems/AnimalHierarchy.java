//Superclass Animal
class Animal{
    protected String name ;
    protected int age ;

    // Constructor
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public void makeSound(){
        System.out.println("Here is a sound produced by animals");
    }

    // Method to display information of the animals
    public void display(){
        System.out.println("Name :"+name+" age "+age);
    }

}
//Subclas Dog
class Dog extends Animal{

    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}
//Subclass Cat
class Cat extends Animal{

    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Meow! Meow!");
    }
}
//Subclass Bird
class Bird extends Animal{

    public Bird(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Tweet! Tweet!");
    }
}
// Main class to test the hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create objects of each subclass
        Animal dog = new Dog("Jackey", 3);
        Animal cat = new Cat("Kity", 2);
        Animal bird = new Bird("Mithu", 1);

        // Method calls through object
        dog.display();
        dog.makeSound();

        cat.display();
        cat.makeSound();

        bird.display();
        bird.makeSound();
    }
}
