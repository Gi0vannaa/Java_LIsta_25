package Lista_Exercicios_Java;

import java.util.Scanner;
//6. Programa que imprime o antecessor e o sucessor de um número inteiro

public class ex6 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite um número inteiro:");
     int numero = scanner.nextInt();

     System.out.println("Antecessor: " + (numero - 1));
     System.out.println("Sucessor: " + (numero + 1));
 }
}