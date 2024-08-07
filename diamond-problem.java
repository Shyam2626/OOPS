import java.util.*;

public class Main implements Demo1, Demo2 {
   
    public void show() {
        Demo1.super.show();  
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.show();
    }
}

interface Demo1 {
    default void show() {
        System.out.println("In Demo1 show method");
    }
}

interface Demo2 {
    default void show() {
        System.out.println("In Demo2 show method");
    }
}
