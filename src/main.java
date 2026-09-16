import java.util.Scanner;
 class main {
    public static void main() {
         Scanner scanner = new Scanner(System.in);
         //Variaveis:
         double Temperatura;
         int i;
double Soma=0;
         for (i = 0; i < 10; i++) {
             System.out.print("Digite a temperatura " + (i + 1) + ": ");
             Temperatura = scanner.nextDouble();

             Soma+=Temperatura;
         }

         double Media= Soma/10;

         System.out.println("A média de temperatura em janeiro de 2026 em Belo Horizonte é:"+Media);


     }
 }