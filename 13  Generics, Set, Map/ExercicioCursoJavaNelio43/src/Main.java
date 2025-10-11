import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        File file = new File("dados.csv");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            Map<String, Integer> listaCandidatos = new LinkedHashMap<>();

            String arrayString = bufferedReader.readLine();

            while (arrayString != null){

                String[] candidatoString = arrayString.split(",");

                Candidato candidato = new Candidato(candidatoString[0], Integer.valueOf(candidatoString[1]));

                if (listaCandidatos.containsKey(candidato.getNome())){
                    int valor = listaCandidatos.get(candidato.getNome());
                    listaCandidatos.put(candidato.getNome(), candidato.getVotos()+valor);
                }
                else{
                    listaCandidatos.put(candidato.getNome(), candidato.getVotos());
                }



                arrayString = bufferedReader.readLine();

            }

            for (String key : listaCandidatos.keySet()){
                System.out.println(key+" "+listaCandidatos.get(key));
            }


        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}