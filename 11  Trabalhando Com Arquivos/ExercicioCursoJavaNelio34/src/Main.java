import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        File arquivo = new File("C:\\teste\\dados.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()){

                if (scanner.nextLine().isEmpty()){
                    return;
                }

                System.out.println(scanner.nextLine());



            }


        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
        finally {
            if (scanner != null){
                scanner.close();
            }
        }




    }
}