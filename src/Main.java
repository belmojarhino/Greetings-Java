public class Main {
    public static void main(String[] args) {
        // How to declare a new variable.
        int integerNumber = 42;
        byte bitNumber = 42;
        short shortNumber = 4200;
        long longNumber = 420000000000L;
        float flutuantNumber = 4.2f;
        double decimalNumber = 42.42;
        var byInferenceNumber = 42;
        char justCharacter = 'X';
        String stringStrictedTyped = "Moisés";
        var stringTypedByInference = "Moisés";
        var numberTypedByInference = 42;


        // Conditionals
        var age = 30;
        if (age > 27) {
            System.out.println("You're approaching 30");
        } else if (age < 25) {
            System.out.println("You're still young");
        } else {
            System.out.println("You are an alien my partner");
        }


    }
}