package Lista_Exercicios_Java;

import java.util.Scanner;
//15. Programa que lê a idade de 20 pessoas e exibe a soma das idades

public class ex15 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int somaIdades = 0;
     for (int i = 0; i < 20; i++) {
         System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
         int idade = scanner.nextInt();
         somaIdades += idade;
     }
     System.out.println("A soma das idades é: " + somaIdades);
 }
}
