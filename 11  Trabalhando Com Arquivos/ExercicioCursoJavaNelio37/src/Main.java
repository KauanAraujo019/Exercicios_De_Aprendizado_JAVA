import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caminho da pasta: ");
        String pathScanner = scanner.nextLine();

        File path = new File(pathScanner);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS:");

        for (File file : folders){
            System.out.println(file);
        }
        System.out.println();

        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS:");

        for (File file : files){
            System.out.println(file);
        }

        scanner.close();

    }
}