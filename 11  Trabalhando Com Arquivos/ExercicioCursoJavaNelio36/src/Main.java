import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros a ser exibido no arquivo: ");
        int valor = scanner.nextInt();
        valor = valor + 1;
        String[] valores = new String[valor];

        for (int i = 0; i < valores.length; i++){
            String a = String.valueOf(i);
            valores[i] = a;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\LDPlayer\\ld.txt"))) {

            for (String valorNums : valores){
                bufferedWriter.write(valorNums);
                bufferedWriter.newLine();
            }

        }
        catch (IOException e){
            System.out.println("ERRO: "+e.getMessage());
        }
        finally {
            System.out.println("Encerrando...");
        }

    }
}