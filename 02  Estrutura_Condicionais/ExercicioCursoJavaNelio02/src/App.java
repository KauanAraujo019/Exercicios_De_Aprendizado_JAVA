import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        if (valor1 >= 0.1 && valor2 >= 0.1){
            System.out.println("Q1");
        }
        else if (valor1 <= -0.1 && valor2 <= -0.1) {
            System.out.println("Q3");
        }
        else if (valor1 <= -0.1 && valor2 >= 0.1) {
            System.out.println("Q2");
        }
        else if (valor1 >= 0.1 && valor2 <= -0.1) {
            System.out.println("Q4");
        }
        else{
            System.out.println("ORIGEM");
        }

    }
    
}
