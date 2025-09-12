import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Department's name: ");
        String nameDepartment = scanner.nextLine();
        Department department = new Department(nameDepartment);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String nameWorker = scanner.nextLine();

        System.out.print("Level: ");
        String levelWorker = scanner.nextLine();
        WorkerLevel level = WorkerLevel.valueOf(levelWorker);

        System.out.print("Base salary: ");
        Double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(nameWorker, level, baseSalary);

        System.out.println("How many contracts to this worker?: ");
        int quantityContracts = scanner.nextInt();
        scanner.nextLine();

        int vetor[] = new int[quantityContracts];

        for (int i = 0; i < vetor.length; i++){
            DateTimeFormatter dat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Enter contract #"+(i+1)+ " data: ");
            System.out.println("Date (DD/MM/YYYY) ");
            String date = scanner.next();
            LocalDate dataContract = LocalDate.parse(date, dat);

            System.out.println("value per hour: ");
            Double valueHour = scanner.nextDouble();

            System.out.println("Duration (hours): ");
            int durationContract = scanner.nextInt();
            scanner.nextLine();

            HourContract hourContract = new HourContract(dataContract, valueHour, durationContract);
            worker.addContract(hourContract);
            scanner.nextLine();


        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String data1 = scanner.next();
        String date001 = data1.substring(0,2);

        String date002 = data1.substring(3,7);

        Integer dataF01 = Integer.parseInt(date001);
        Integer dataF02 = Integer.parseInt(date002);

        double salaryTot = worker.income(dataF02, dataF01);

        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+department.getName());
        System.out.println("Income for: "+data1+" "+salaryTot);
    }
}