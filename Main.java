import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    char continuar;
    double a;
    double b;
    char tipo;
    System.out.println("Bem vindo a calculadora!");

    do {
        System.out.println("Qual o primeiro numero? ");
        a = sc.nextDouble();
        System.out.println("Qual o segundo numero? ");
        b = sc.nextDouble();
        System.out.println("Qual operacao voce quer? (+ | - | d)");
        tipo = sc.next().charAt(0);

    switch (tipo) {
        case '+':
            System.out.printf("Seu resultado e: %.2f%n", a + b);
            break;
        case '-':
            System.out.printf("Seu resultado e: %.2f%n", a - b);
            break;
        case 'd':
            System.out.printf("Seu resultado e: %.2f%n", a / b);
            break;
        default:
            System.out.println("Operaçao invalida!");
            break;
    }
    System.out.println("Deseja continuar?");
    continuar =  sc.next().toLowerCase().charAt(0);
    } while (continuar == 's');
       System.out.println("Encerrando Calculadora!");
       sc.close();
}
