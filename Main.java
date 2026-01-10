import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;
        double a;
        double b;
        char type;
        System.out.println("Welcome to Calculator!");

        do {
            System.out.println("What is the first number?");
            a = sc.nextDouble();
            System.out.println("What is the second number?");
            b = sc.nextDouble();
            System.out.println("What operation do you want? (+ | - | * | /)");
            type = sc.next().charAt(0);

            switch (type) {
                case '+':
                    showResult(add(a,b));
                    break;
                case '-':
                    showResult(subtract(a,b));
                    break;
                case '*':
                    showResult(multiply(a,b));
                    break;
                case '/':
                    if (b == 0){
                        System.out.println("Error: cannot divide by zero!");
                    }
                    else {
                        showResult(divide(a, b));
                    }
                    break;
                default:
                    System.out.println("Invalid Operation!");
                    break;
            }
            System.out.println("Do you want to continue? (s/n)");
            again = sc.next().toLowerCase().charAt(0);
        } while (again == 's');
        System.out.println("Ending Calculator!");
        sc.close();
    }
    public static double add(double x,double y){
      return x + y;
    }
    public static double subtract(double x,double y){
        return x - y;
    }
    public static double divide(double x,double y){
        return x / y;
    }
    public static double multiply(double x, double y){
        return x * y;
    }
    public static void showResult(double result){
        System.out.println("Your Result: " + result);
    }
}
