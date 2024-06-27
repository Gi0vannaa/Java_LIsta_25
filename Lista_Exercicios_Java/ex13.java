package Lista_Exercicios_Java;

import java.util.Scanner;
//13. Programa que converte temperatura de Celsius para Fahrenheit

public class ex13 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite a temperatura em graus Celsius:");
     double celsius = scanner.nextDouble();

     double fahrenheit = (9 * celsius + 160) / 5;
     System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
 }
}