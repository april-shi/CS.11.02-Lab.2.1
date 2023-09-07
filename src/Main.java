import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(add(5,7));
        System.out.println(add(5,7,6,6));
        System.out.println(morningGreeting("Toby Fox"));
        System.out.println(afternoonGreeting("Mac Miller"));
        System.out.println(triple("oohbaby"));
        System.out.println(half(19));
        System.out.println(roundPositiveValueToNearestInteger(8.5));
        System.out.println(roundPositiveValueToNearestInteger(8.49));
        System.out.println(roundNegativeValueToNearestInteger(-8.49));
        System.out.println(roundNegativeValueToNearestInteger(-8.5));
    }

    // 1. add
    public static int add(int a, int b){

        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d){

        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){

        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){

        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String babe){

        return babe+babe+babe;
    }
    // 6. half
    public static double half(int one){

        return (double) one /2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double one){

        return (int) (one + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double two){

        return (int) (two - 0.5);
    }

}
