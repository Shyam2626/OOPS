class Calc{

    public void add(int a,int b){
        System.out.println("Addition is "+(a+b));
    }

    public void sub(int a,int b){
        System.out.println("Subraction is "+Math.abs(a-b));
    }

}

class AdvCalc extends Calc{

    public AdvCalc(int a,int b){
        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
    }

    public void mul(int a,int b){
        System.out.println("Multiplication is "+(a*b));
    }

    public void div(int a,int b){
        System.out.println("Division is "+a/b);
    }

}

public class Inheritance {

    public static void main(String args[]){

        AdvCalc obj=new AdvCalc(20,10);


    }
    
}
