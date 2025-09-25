package main.Project.model.application;

import main.Project.model.entities.Contract;
import main.Project.model.services.ContractServices;
import main.Project.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter os dados do contrato:");
        System.out.print("Numero: ");
        Integer numContrato = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);
        System.out.print("Valor do contrato: ");
        Double valorContrato = scanner.nextDouble();
        System.out.print("Numeros de parcelas: ");
        Integer quantParcelas = scanner.nextInt();

        Contract contract = new Contract(numContrato, date, valorContrato);
        ContractServices contractServices = new ContractServices();

        System.out.println("PARCELAS:");
        contractServices.processContract(contract, quantParcelas, new PaypalService());


    }
}