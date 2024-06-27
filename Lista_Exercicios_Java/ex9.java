package Lista_Exercicios_Java;

import java.util.Scanner;
//9. Programa que calcula quantos salários mínimos um usuário ganha

public class ex9 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite o valor do salário mínimo:");
     double salarioMinimo = scanner.nextDouble();

     System.out.println("Digite o valor do salário do usuário:");
     double salarioUsuario = scanner.nextDouble();

     double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
     System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");
 }
}