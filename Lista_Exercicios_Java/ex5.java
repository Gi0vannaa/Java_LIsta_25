package Lista_Exercicios_Java;

import java.util.Scanner;
//5. Programa que informa a classe eleitoral de uma pessoa

public class ex5 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite a idade:");
     int idade = scanner.nextInt();

     if (idade < 16) {
         System.out.println("Não eleitor.");
     } else if (idade < 18 || idade >= 65) {
         System.out.println("Eleitor facultativo.");
     } else {
         System.out.println("Eleitor obrigatório.");
     }
 }
}