package lab1.properexample;

class ProperExample {

    private final static String STATIC_VARIABLE = "Static context";

    private final String name = "Java";
    private final int year = 2019;

    //constructor
    ProperExample() {
        System.out.println("I am inside constructor!");
    }

    String getName() {
        return name;
    }

    int getYear() {
        return year;
    }

    void hello(){
        System.out.println("Welcome to " + name);
    }

    static void staticHello(){
        System.out.println("This is a " + STATIC_VARIABLE);
    }
}
