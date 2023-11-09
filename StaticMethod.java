class Mobile{

    String brandName;
    int price;
    static String model;

    public void Display(){
         System.out.println(brandName +" : "+price+" : "+model);
    }

    public static void Display1(Mobile obj){
        // Note:
        // Static method doesn't directly work with instance variables of the class
        // so the spectific boj must passed along the static methos to access thos instance variables.
         System.out.println(obj.brandName +" : "+obj.price+" : "+model);
    }
}

public class StaticMethod {

    public static void main(String args[]){

        //Object 1
        Mobile obj1=new Mobile();
        obj1.brandName="Apple";
        obj1.price=150000;

        //Object2
        Mobile obj2=new Mobile();
        obj2.price=125000;
        obj2.brandName="Samsung";

        Mobile.model="Phone";
        //automatically apply to all other objects because model is a static variable
        //best practice to call static varible is by using class name i.e Mobile.model

        obj1.Display();
        obj2.Display();

        //Static method can be called using class name
        Mobile.Display1(obj1);
        Mobile.Display1(obj2);

    }
    
}
