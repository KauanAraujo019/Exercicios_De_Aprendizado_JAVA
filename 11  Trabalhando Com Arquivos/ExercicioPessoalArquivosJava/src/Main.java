import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o diretório para ler: ");
        String nameDir = scanner.nextLine();

        File path = new File(nameDir);

        File[] folders = path.listFiles(File::isDirectory);
        File[] files = path.listFiles(File::isFile);

        Boolean creat = null;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Pasta_Exemplo\\arquivo.txt"))){

            bufferedWriter.write("-----------------------NAME PASTAS-----------------------");
            bufferedWriter.newLine();
            for (File folder : folders){
                bufferedWriter.newLine();
                String nameFolder = folder.toString();
                bufferedWriter.write(nameFolder);

            }
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("-----------------------NAME ARQUIVOS-----------------------");
            bufferedWriter.newLine();
            for (File file : files){
                bufferedWriter.newLine();
                String nameFiler = file.toString();
                bufferedWriter.write(nameFiler);
            }

            creat = true;

        }
        catch (IOException e) {
            System.out.println("ERRO: "+e.getMessage());
        }
        finally {
            if (creat != null){
                System.out.println("DIRETORIO LIDO E CRIADO COM SUCESSO!");
                System.out.println("Encerrando...");
            }
            else{
                System.out.println("Encerrando...");
            }
        }


        scanner.close();







    }
}