import java.util.Scanner;
public class Main{
 static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        char tipo;
        System.out.println("Bem vindo a calculadora!");
        System.out.println("Qual o primeiro numero? ");
        a = sc.nextDouble();
        System.out.println("Qual o segundo numero? ");
        b = sc.nextDouble();
        System.out.println("Qual operacao voce quer? (+ | - | d");
        tipo = sc.next().charAt(0);
        if (tipo == '+'){
            System.out.println("sua soma deu: " + (a + b));
        } else if (tipo == '-') {
            System.out.println("sua subtracao deu: " + (a - b));
        } else if (tipo == 'd') {
            System.out.println("sua divisao deu: " + (a / b));
        }
        sc.close();
}
}




