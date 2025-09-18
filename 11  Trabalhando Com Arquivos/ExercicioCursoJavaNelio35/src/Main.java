import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\mylog.log"))) {
            String nextLine = bufferedReader.readLine();

            while (nextLine != null){
                System.out.println(nextLine);
                nextLine = bufferedReader.readLine();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("erro"+e.getMessage());
        }
        catch (IOException e) {
            System.out.println("ERRO"+e.getMessage());

        }
        finally {
            System.out.println();
            System.out.println("Encerrando...");

        }
    }
}