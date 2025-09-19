import java.io.*;


public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Pasta_Exemplo\\arquivo.csv");


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Pasta_Exemplo\\out\\summary.csv")); BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String line = bufferedReader.readLine();

            while (line != null){
                String[] partesProd = line.split(",");
                double precoP = Double.parseDouble(partesProd[1]);
                int unidadeP = Integer.parseInt(partesProd[2]);
                double precoTotal = precoP * unidadeP;

                String prodFormat = partesProd[0]+","+String.format("%.2f", precoTotal);

                bufferedWriter.write(prodFormat);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }

        }
        catch (IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        }

    }
}