import entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String nameClient = scanner.nextLine();

        System.out.print("Email: ");
        String emailClient = scanner.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthC = scanner.next();
        LocalDate birthClient = LocalDate.parse(birthC, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Client client01 = new Client(nameClient, emailClient, birthClient);


        System.out.println("Enter Order data:");
        System.out.print("Status: ");
        String status = scanner.next();

        System.out.println("How many items this order?: ");
        int quant = scanner.nextInt();
        scanner.nextLine();

        client01.addOrder(LocalDateTime.now(), OrderStatus.valueOf(status));

        for (int i = 0; i < quant; i++){
            System.out.println("ENTER #"+(i+1)+" ITEM DATA:");
            System.out.print("Product name: ");
            String nameP = scanner.nextLine();

            System.out.print("Product price: ");
            double priceP = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantP = scanner.nextInt();
            scanner.nextLine();

            Product product = new Product(nameP, priceP);

            OrderItem orderItem = new OrderItem(quantP, product.getPrice(), product);

            client01.getOrder().addOrderItem(orderItem);

        }

        System.out.println(client01);

        scanner.close();

    }
}