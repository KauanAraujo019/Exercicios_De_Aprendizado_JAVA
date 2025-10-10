import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Nova pasta\\teste.txt");

        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            Set<Usuarios> listaStringsSet = new HashSet<>();

            String line = bufferedReader.readLine();
            while (line != null){
                String[] stringUsuario = line.split(" ");
                String nomeUsuario = stringUsuario[0];
                Instant date = Instant.parse(stringUsuario[1]);

                listaStringsSet.add(new Usuarios(nomeUsuario, date));

                line = bufferedReader.readLine();

            }

            System.out.println("Users: "+listaStringsSet.size());



        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}