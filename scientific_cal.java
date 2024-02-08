import java.util.*;
import java.lang.Math;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        if (a > b)
            return a - b;
        return b - a;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mul(int a, int b) {
        return a * b;
    }
}

class Scientific extends Calculator {
    public int SI(int p, int t, int r) {
        return Math.round((p * t * r) / 100);
    }

    public double pow(double a, int power) {
        return Math.pow(a, power);
    }
}
class Main {
    public static void main(String[] args) {
        double a = 2;
        int power = 4;
        Scientific s = new Scientific();
        double result = s.pow(a, power);
        System.out.println(result);
    }
}
