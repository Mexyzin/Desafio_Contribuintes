package dev_superior.JavaeProgramaçãoOrientadaaObjetosExpert.Memória_vetores_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DESAFIO_Contribuintes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> listTax = new ArrayList<>();

        TaxPayer tax;
        int n;

        System.out.print("Quantos contribuintes você vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.printf("\nDigite os dados do %do contribuinte:\n", i + 1);

            System.out.print("Renda anual com salário: ");
            double salary = sc.nextDouble();

            System.out.print("Renda anual com prestação de serviço: ");
            double serviceInCome = sc.nextDouble();

            System.out.print("Renda anual com ganho de capital: ");
            double capitalAnnualInCome = sc.nextDouble();

            System.out.print("Gastos médicos: ");
            double medicalExpense = sc.nextDouble();

            System.out.print("Gastos educacionais: ");
            double spentEducation = sc.nextDouble();

            tax = new TaxPayer(salary, serviceInCome, capitalAnnualInCome, medicalExpense, spentEducation);

            listTax.add(tax);
        }

        int x = 1;

        for (TaxPayer taxas : listTax) {
            System.out.printf("\nResumo do %do contribuinte:\n", x);

            System.out.printf("Imposto bruto total: %.2f%n", taxas.grossTax());

            System.out.printf("Abatimento: %.2f%n", taxas.taxRebate());

            System.out.printf("Imposto devido: %.2f%n", taxas.netTax());
            x++;
        }

        sc.close();
    }
}
