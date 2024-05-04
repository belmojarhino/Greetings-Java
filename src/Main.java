public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        short n2 = 1000;
        long n3 = 100000000L;
        long n4 = 100000000;

        float n5 = 3.14f;
        double n6 = 3.14;

        byte n7 = 5;
        char character = 'A';

        // Explicit type declaration
        String text = "Hello World";

        // Implicit type inference using var. Here the lag will get the type based on the var value.
        var texTwo = "Hello World";


        System.out.println("Type of primitive data");
    }
}