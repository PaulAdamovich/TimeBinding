package Binding;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        System.out.println(animal.a);
        System.out.println(animal.b);
        animal.abc();
        animal.def();
    }
}

class Animal{
    int a = 5;  //this is variable => Compile time Binding
    static int b = 10;  //this is variable => Compile time Binding
    void abc(){
        System.out.println("Non-static method from Animal");
    }
    static  void def(){
        System.out.println("Static method from Animal");
    } //static methods start in Compile time Binding
}

class Tiger extends Animal{
    int a = 15;
    static int b = 20;
    void abc(){
        System.out.println("Non-static method from Tiger");
    }  //this is overriding method => Runtime Binding
    static  void def(){
        System.out.println("Static method from Tiger");
    } //This is Hiding method
}
