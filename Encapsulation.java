//Encapsulation is used to provide privacy to our variables(data).
//So these varibales can be accessed only through methods
//To ensure Encapsulation all the variables must be declared in private modifier
//private variables can be accessed anywhere in the same class but for different class it must be accessed only through methods
//This is called Encapsulation

//for automatic generation of get and set methods simply right click and select source action option and select "Generate getters and setters"

class Human{
    private int age;
    private String name;

    public void setAge(int newAge){
        age=newAge;
    }

    public void setName(String newName){
        name=newName;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class Encapsulation {
    public static void main(String srgs[]){
        Human obj=new Human();
        obj.setAge(20);
        obj.setName("Shyam K");
        System.out.println("My name is "+obj.getName()+" and I'm "+obj.getAge()+" years old");
    }
}
