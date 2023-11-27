//Method Overloading - Same method name with different arguments.
//Method Overriding - Same methos name with same arguments used to override the method of the parent class

class A{
    public void add(int a,int b){
        System.out.print("Addition of A and B is "+(a+b));
    }
}

class B extends A{
    public void add(int a,int b){
        System.out.print("Addition of A and B is "+(a+b+1));
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj=new B();
        obj.add(10,30);
    }
}


