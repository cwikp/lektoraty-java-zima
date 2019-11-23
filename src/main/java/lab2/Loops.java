package lab2;

public class Loops {

    public static void main(String[] args) {

        System.out.println("Before while loop...");
        int i = 0;

        while (i < 10) {
            System.out.println("Looping!");
            i++;
        }
        System.out.println("...after while loop.");


        System.out.println("Before for loop...");
        for (int j = 0; j< 10; j++){
            System.out.println("Looping! Value of j: " + j);
        }
        System.out.println("...after for loop.");
    }
}
