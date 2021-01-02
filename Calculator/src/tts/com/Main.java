package tts.com;

public class Main {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        Calculator c2 = new Calculator ();

        c1.name= "Heather's Calc";
        c2.name= "Nabe Hotpot";



        System.out.println(c1.name + " added 124 and 345, then calculated " + c1.add(124, 345));
        System.out.println(c1.name + " multiplied 124 and 345, then calculated " + c1.multiply(124, 345));
        System.out.println(c1.name + " divided 124 by 345, then calculated " + c1.divide(124, 345));
        System.out.println(c1.name + " subtracted 124 and 345, then calculated " + c1.subtract(124, 345));
        System.out.println(c1.name + " squared 124 by 345, then calculated " + c1.square(124));


        System.out.println("The sin of this number is "+ Math.sin(Math.toRadians(45)));
        System.out.println("The cosine of this number is "+ Math.cos(Math.toRadians(45)));
        System.out.println("The tangent of this number is "+ Math.tan(Math.toRadians(45)));
        System.out.println("The square root of this number is "+ Math.sqrt(Math.toRadians(45)));
        System.out.println("5's factorial is " + factorial(5));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }


}
