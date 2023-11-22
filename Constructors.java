//Constructors are initialized when the object for the class is created
// they are mostly used to do initial operation
//Types : Default Constructor and Parameterized Constructor

class Human {

    private int age;
    private String name;

    //Default Constructor
    public Human() {
        System.out.println("Default Constructor");
    }

    //Parameterized Constructor with two arguements
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("My name is "+name+" and I'm "+age+" years old");
    }

    //Parameterized Constructor with one arguements
    public Human(String name) {
        this.name = name;
        this.age=21;
         System.out.println("My name is "+name+" and I'm "+age+" years old");
    }

}

public class Constructors {
    public static void main(String args[]) {

        Human obj1 = new Human();

        Human obj2=new Human(43,"John");

        Human obj3=new Human("shyam");

    }

}
