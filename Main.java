import java.util.Scanner;

 void main(){
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    char tipo;
    System.out.println("Bem vindo a calculadora!");
    System.out.println("Qual o primeiro numero? ");
    a = sc.nextDouble();
    System.out.println("Qual o segundo numero? ");
    b = sc.nextDouble();
    System.out.println("Qual operacao voce quer? (+ | - | d)");
    tipo = sc.next().charAt(0);
     switch(tipo){
         case '+':
             System.out.printf("Seu resultado e: %.2f%n", a + b);
             break;
         case '-':
             System.out.printf("Seu resultado e: %.2f%n", a - b);
             break;
         case 'd':
             System.out.printf("Seu resultado e: %.2f%n", a / b);
             break;
     }
    sc.close();
}





