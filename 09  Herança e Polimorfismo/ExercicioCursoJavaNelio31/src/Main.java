import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberProd = scanner.nextInt();

        for (int i = 1; i <= numberProd; i++){

            System.out.println("Produtct #"+i+" data:");
            System.out.print("Common, Used or Imported? (C/U/I): ");
            char cuiProd = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String nameProd = scanner.nextLine();
            System.out.print("Price: ");
            double priceProd = scanner.nextDouble();

            if (cuiProd == 'C' || cuiProd == 'c'){
                Product product = new Product(nameProd, priceProd);

                listProduct.add(product);

            }
            else if (cuiProd == 'U' || cuiProd == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateProd = scanner.next();
                LocalDate dateProduct = LocalDate.parse(dateProd, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Product productUsed = new UsedProduct(nameProd, priceProd, dateProduct);

                listProduct.add(productUsed);

            }
            else if (cuiProd == 'I' || cuiProd == 'i'){
                System.out.print("Customs fee: ");
                double feeProd = scanner.nextDouble();

                Product productImport = new ImportedProduct(nameProd, priceProd, feeProd);

                listProduct.add(productImport);

            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : listProduct){
            System.out.println(p.priceTag());

        }





        scanner.close();
    }
}