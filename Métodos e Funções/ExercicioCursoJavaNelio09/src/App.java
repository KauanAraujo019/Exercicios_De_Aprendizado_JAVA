import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotação atual do dólar: ");
        CurrentDolar.dolarAtual = scanner.nextDouble();
        System.out.print("Digite a quantidade de dólar a ser comprada: ");
        CurrentDolar.dolarQuantidade = scanner.nextDouble();
        System.out.printf("DOLAR REQUIRIDO: %.2f%n", CurrentDolar.dolarQuantidade);
        System.out.printf("Quantidade a ser paga em reais R$ %.2f%n", CurrentDolar.dolarConversion());

        scanner.close();
    }
}
