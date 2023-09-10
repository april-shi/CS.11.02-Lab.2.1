import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int addingNumbers = add(5,7);
        int addingFourNum = add(5,7,6,6);
        String morning = morningGreeting("Toby Fox");
        String afternoon = afternoonGreeting("Mac Miller");
        String triplingStuff = triple("oohbaby");
        double halfingStuff = half(19);
        int roundingPositive = roundPositiveValueToNearestInteger(8.5);
        int roundingPositive2 = roundPositiveValueToNearestInteger(8.49);
        int roundingNegative = roundNegativeValueToNearestInteger(-8.49);
        int roundingNegative2 = roundNegativeValueToNearestInteger(-8.5);

        System.out.println(addingNumbers);
        System.out.println(addingFourNum);
        System.out.println(morning);
        System.out.println(afternoon);
        System.out.println(triplingStuff);
        System.out.println(halfingStuff);
        System.out.println(roundingPositive);
        System.out.println(roundingPositive2);
        System.out.println(roundingNegative);
        System.out.println(roundingNegative2);

        return;

    }

    // 1. add

    public static int add(int a, int b){

        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d){

        return add(add (a,b), add (c,d));
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
