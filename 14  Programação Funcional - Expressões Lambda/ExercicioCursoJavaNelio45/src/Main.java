import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        File file = new File("produtos.csv");

        List<Produto> listaProdutos = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line = bufferedReader.readLine();

            while (line != null){
                String[] arrayP = line.split(",");

                listaProdutos.add(new Produto(arrayP[0], Double.parseDouble(arrayP[1])));

                line = bufferedReader.readLine();


            }

            double media = listaProdutos.stream().
                    map(p -> p.getPreco()).
                    reduce(0.0, (x,y) -> x + y)/listaProdutos.size();



            List<String> nomeProdutos = listaProdutos.stream().
                    filter(p -> p.getPreco() < media).
                    map(y -> y.getNome()).
                    collect(Collectors.toList());



            System.out.println("PREÇO MÉDIA: "+media);
            nomeProdutos.forEach(System.out::println);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}