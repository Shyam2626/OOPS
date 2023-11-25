//Anonymous objects are without object names, so they can be used only once

class Demo{

    public Demo(){
        System.out.println("Constructor Created..");
    }
    public void show(){
        System.out.println("In show() method");
    }
}

public class AnonymousObject {

    public static void main(String args[]){

        new Demo().show(); //Anonymous Object

    }
    
}
