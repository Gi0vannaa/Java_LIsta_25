package Lista_Exercicios_Java;

import java.util.Scanner;
// 3. Programa que calcula crédito especial com base no saldo médio

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo médio do último ano:");
        double saldoMedio = scanner.nextDouble();

        double credito = 0;

        if (saldoMedio > 400) {
            credito = saldoMedio * 0.30;
        } else if (saldoMedio > 300) {
            credito = saldoMedio * 0.25;
        } else if (saldoMedio > 200) {
            credito = saldoMedio * 0.20;
        } else {
            credito = saldoMedio * 0.10;
        }

        System.out.println("Saldo médio: " + saldoMedio);
        System.out.println("Valor do crédito: " + credito);
    }
}