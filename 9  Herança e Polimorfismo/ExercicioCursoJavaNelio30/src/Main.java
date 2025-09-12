import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> listEmployees = new ArrayList<>();

        System.out.print("Enter the numbers of employees: ");
        int quantEmp = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantEmp; i++){

            System.out.println("Employee #"+(i+1)+" Data:");
            System.out.print("outsourced? (Y/N): ");
            String isOutsourced = scanner.nextLine();

            if (isOutsourced.equalsIgnoreCase("y")){

                System.out.print("Name: ");
                String nameEmp = scanner.nextLine();
                System.out.print("Hours: ");
                int hoursEmp = scanner.nextInt();
                System.out.print("Value per hour: ");
                Double valueHourEmp = scanner.nextDouble();
                System.out.print("Additional charge: ");
                Double additCharge = scanner.nextDouble();

                Employee employeeOutSource = new OutSourcedEmployee(nameEmp, hoursEmp, valueHourEmp, additCharge);

                listEmployees.add(employeeOutSource);

                scanner.nextLine();

            }
            else if (isOutsourced.equalsIgnoreCase("n")){

                System.out.print("Name: ");
                String nameEmp = scanner.nextLine();
                System.out.print("Hours: ");
                int hoursEmp = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Value per hour: ");
                Double valueHourEmp = scanner.nextDouble();

                Employee employee = new Employee(nameEmp, hoursEmp, valueHourEmp);

                listEmployees.add(employee);

                scanner.nextLine();
            }


        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee listEmployee : listEmployees) {
            System.out.println(listEmployee.getName() + " - " + "$ " + String.format("%.2f", listEmployee.payment()));

        }

        scanner.close();
    }
}