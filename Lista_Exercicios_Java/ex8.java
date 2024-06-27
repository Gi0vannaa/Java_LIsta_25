package Lista_Exercicios_Java;

import java.util.Scanner;
//8. Programa que calcula o valor total de peças com IPI

public class ex8 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite a porcentagem do IPI:");
     double ipi = scanner.nextDouble();

     System.out.println("Digite o código da peça 1:");
     int codigo1 = scanner.nextInt();
     System.out.println("Digite o valor unitário da peça 1:");
     double valor1 = scanner.nextDouble();
     System.out.println("Digite a quantidade de peças 1:");
     int quant1 = scanner.nextInt();

     System.out.println("Digite o código da peça 2:");
     int codigo2 = scanner.nextInt();
     System.out.println("Digite o valor unitário da peça 2:");
     double valor2 = scanner.nextDouble();
     System.out.println("Digite a quantidade de peças 2:");
     int quant2 = scanner.nextInt();

     double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
     System.out.println("O valor total a ser pago é: " + total);
 }
}