import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o diretorio com o arquivo: ");
        String folder = scanner.nextLine();

        File file = new File(folder);

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());


        scanner.close();
    }
}