class A{

    public void show(){
        System.out.println("In show Method of Class A");
    }

    class B{

        public void config(){
            System.out.print("In Config Method of Class B");
        }

    }
}

public class InnerClass {
    
    public static void main(String[] args) {
        
        A obj1=new A();
        obj1.show();

        A.B obj2=obj1.new B();
        obj2.config();

    }
}
