package Lista_Exercicios_Java;

import java.util.Scanner;
//14. Programa que calcula a soma de 10 números

public class ex14 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int soma = 0;
     for (int i = 0; i < 10; i++) {
         System.out.println("Digite um número:");
         int numero = scanner.nextInt();
         soma += numero;
     }
     System.out.println("A soma dos 10 números é: " + soma);
 }
}
