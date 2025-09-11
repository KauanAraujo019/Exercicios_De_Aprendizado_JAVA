import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.print("Digite a largura do retangulo: ");
        retangulo.width = scanner.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        retangulo.height = scanner.nextDouble();
        retangulo.area();
        retangulo.perimeter();
        retangulo.diagonal();


        scanner.close();
    }
}
