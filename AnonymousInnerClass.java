class A{
    public void show(){
        System.out.print("In show Method of Class A");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        
        A obj=new A()
        {
            //Anonymous class
            public void show(){
                System.out.print("In show Method of Anonymous Class");
            }
        };

        obj.show();

    }
}
