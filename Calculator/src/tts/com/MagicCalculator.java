package tts.com;

import java.lang.Math;

public class MagicCalculator {
    String name;

    public static double sin(double a){
    return Math.sin(a);
    }

    public static double tan(double a){
        return Math.tan(a);
    }
    public static double cos(double a){
        return Math.cos(a);
    }
    public static double sqrt(double a){
        return Math.sqrt(a);
    }

    public static int factorial(int n){
        if (n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }



            }

        }


