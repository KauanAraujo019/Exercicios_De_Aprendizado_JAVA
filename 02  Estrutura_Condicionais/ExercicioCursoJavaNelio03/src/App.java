import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codProduto;

        
        do{ 
            System.out.print("DIGITE O CODIGO DO RESPECTIVO PRODUTO: ");
            codProduto = scanner.nextInt();
            switch (codProduto) {
                case 1:
                    alcool ++; 
                    break;
                case 2:
                    gasolina ++;
                    break;
                case 3: 
                    diesel ++;
            
                default:
                    break;
            }
              
        }while (codProduto != 4);
        System.out.println("MUITO OBRIGADO!!");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);

        scanner.close();
    }
}
