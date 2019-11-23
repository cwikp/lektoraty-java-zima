package lab1.properexample;

public class Main {

    public static void main(String[] args) {
        ProperExample properExample = new ProperExample();
        properExample.hello();

        System.out.println(properExample.getName());
        System.out.println(properExample.getYear());

        ProperExample.staticHello();
    }

}
