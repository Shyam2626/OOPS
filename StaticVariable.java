//some Variables all the values are same for all the objects.So those variables are declared with static keyword
//So they are called static variable.

class Mobile{
    String brandName;
    int price;
    static String model;

    public void Display(){
        System.out.println(brandName +" : "+price+" : "+model);
    }

}

public class StaticVariable {
    public static void main(String args[]){

        //Object 1
        Mobile obj1=new Mobile();
        obj1.brandName="Apple";
        obj1.price=150000;

        //Object2
        Mobile obj2=new Mobile();
        obj2.price=125000;
        obj2.brandName="Samsung";

        obj1.model="Phone"; //automatically apply to all other objects because model is a static variable

        obj1.Display();
        obj2.Display();

    }
}

//Output
// Apple : 150000 : Phone
// Samsung : 125000 : Phone
