package Lista_Exercicios_Java;

import java.util.Scanner;
//4. Programa que imprime três valores em ordem decrescente

public class ex4 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite o valor A:");
     int a = scanner.nextInt();

     System.out.println("Digite o valor B:");
     int b = scanner.nextInt();

     System.out.println("Digite o valor C:");
     int c = scanner.nextInt();

     if (a >= b && a >= c) {
         if (b >= c) {
             System.out.println(a + ", " + b + ", " + c);
         } else {
             System.out.println(a + ", " + c + ", " + b);
         }
     } else if (b >= a && b >= c) {
         if (a >= c) {
             System.out.println(b + ", " + a + ", " + c);
         } else {
             System.out.println(b + ", " + c + ", " + a);
         }
     } else {
         if (a >= b) {
             System.out.println(c + ", " + a + ", " + b);
         } else {
             System.out.println(c + ", " + b + ", " + a);
         }
     }
 }
}