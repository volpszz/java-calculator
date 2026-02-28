package calculus;

public class Calculus {

    // add
    public static double add(double a, double b) {
        return a + b;
    }

    // subtract
    public static double subtract(double a, double b) {
        return a - b;
    }

    // divide
    public static double divide(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Error, Division by zero! ");
        }
        else {
            return a / b;
        }
    }
    // multiply
    public static double multiply(double a, double b){
        return a * b;
    }
    // showResult
    public static void showResult(double result){
        System.out.printf("Result: ",result);
    }


}


