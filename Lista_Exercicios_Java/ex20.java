package Lista_Exercicios_Java;

import java.util.Scanner;
//16. Programa que lê a idade de 20 pessoas e exibe a média das idades

public class ex20 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int somaIdades = 0;
     for (int i = 0; i < 20; i++) {
         System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
         int idade = scanner.nextInt();
         somaIdades += idade;
     }
     double mediaIdades = somaIdades / 20.0;
     System.out.println("A média das idades é: " + mediaIdades);
 }
}
