class Calc{

    public void add(int a,int b){
        System.out.println("Addition is "+(a+b));
    }

    public void sub(int a,int b){
        System.out.println("Subraction is "+Math.abs(a-b));
    }

}

class AdvCalc extends Calc{


    public void mul(int a,int b){
        System.out.println("Multiplication is "+(a*b));
    }

    public void div(int a,int b){
        System.out.println("Division is "+a/b);
    }

}

class ScientificCalc extends AdvCalc{

    public ScientificCalc(int a,int b){
        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
        power(a, b);
    }

    public void power(int a,int b){
        System.out.println("Power of "+a+" and "+b+" is "+Math.pow(a,b));
    }

}

public class SingleAndMultilevelInheritance {

    public static void main(String args[]){

        ScientificCalc obj=new ScientificCalc(10, 10);
        
    }
    
}
