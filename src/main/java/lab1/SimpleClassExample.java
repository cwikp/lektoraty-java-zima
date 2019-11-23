package lab1;

public class SimpleClassExample {

    String name = "Java";
    int year = 2019;

    static String staticVariable = "Static context";

    void hello(){
        System.out.println("Welcome to " + name);
    }

    static void staticHello(){
        System.out.println("This is a " + staticVariable);
    }

    public static void main(String[] args) {
        SimpleClassExample simpleExample = new SimpleClassExample();
        simpleExample.hello();

        System.out.println(simpleExample.name);
        System.out.println(simpleExample.year);

        SimpleClassExample.staticHello();
    }
}
