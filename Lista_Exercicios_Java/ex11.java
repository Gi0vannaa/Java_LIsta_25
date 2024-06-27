package Lista_Exercicios_Java;

import java.util.Scanner;
//11. Programa que calcula o salário final do mês de um vendedor

public class ex11 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite o nome do vendedor:");
     String nome = scanner.nextLine();

     System.out.println("Digite o salário fixo:");
     double salarioFixo = scanner.nextDouble();

     System.out.println("Digite o total de vendas efetuadas no mês:");
     double totalVendas = scanner.nextDouble();

     double comissao = totalVendas * 0.15;
     double salarioFinal = salarioFixo + comissao;

     System.out.println("Nome: " + nome);
     System.out.println("Salário fixo: " + salarioFixo);
     System.out.println("Salário final: " + salarioFinal);
 }
}