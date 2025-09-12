import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contribuinte> listContribuintes = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numPayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numPayers; i++){

            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company? (i/c): ");
            char indComp = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Anual Income: ");
            Double income = scanner.nextDouble();

            if (indComp == 'i' || indComp == 'I'){
                System.out.print("Health expenditures: ");
                Double healt = scanner.nextDouble();

                PessoaFisica pessoaFisica = new PessoaFisica(name, income, healt);

                listContribuintes.add(pessoaFisica);


            }
            else if (indComp == 'c' || indComp == 'C'){
                System.out.print("Number of employees: ");
                int numEmp = scanner.nextInt();
                scanner.nextLine();

                PessoaJuridica pessoaJuridica = new PessoaJuridica(name, income, numEmp);

                listContribuintes.add(pessoaJuridica);

            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contribuinte contribuinte : listContribuintes){
            System.out.println(contribuinte.getNome()+": $ "+String.format("%.2f",contribuinte.calculoImposto()));

        }

        double totalTaxes = 0.0;
        for(Contribuinte contribuinte : listContribuintes){
            totalTaxes = totalTaxes + contribuinte.calculoImposto();

        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ "+String.format("%.2f",totalTaxes));


        scanner.close();


    }
}