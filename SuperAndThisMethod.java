//Super() Method is used to call the constructor of the super class from the sub class
//this() Methos is used to call the constructor of the same class;


class A{
    public A(){
        System.out.println("Default constructor in A class");
    }
    public A(int n){
        this();
        System.out.println("Parameterized constructor in A class");
    }
}
class B extends A{
    public B(){
        super(5);
        System.out.println("Default constructor in B class");
    }
    public B(int n){
        System.out.println("Parameterized constructor in B class");
    }
}

public class SuperAndThisMethod {
    public static void main(String args[]){
        B obj1=new B();
    }
    
}

// Output :

// Default constructor in A class
// Parameterized constructor in A class
// Default constructor in B class

// Working :

// 1. Class B object is created and using super() method it calss the Parameterized constructor of super class and
// 2. Then in Parameterized constructor of class A , this() method calls the Default constructor of A class.
// 3. So "Default constructor in A class" printed first and then "Parameterized constructor in A class"
// 4. Finnaly Default constructor of B will be executed.

