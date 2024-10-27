package interfaces.default_methods.application;

// exemplo
/*
Fazer um programa para ler uma quantia e a duração em meses de um
empréstimo. Informar o valor a ser pago depois de decorrido oprazo do
empréstimo, conforme regras de juros do Brasil.A regra de cálculo de
juros do Brasil é juro composto padrão de 2% aomês.
*/

import interfaces.default_methods.services.BrazilInterestService;
import interfaces.default_methods.services.InterestService;
import interfaces.default_methods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(5.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
