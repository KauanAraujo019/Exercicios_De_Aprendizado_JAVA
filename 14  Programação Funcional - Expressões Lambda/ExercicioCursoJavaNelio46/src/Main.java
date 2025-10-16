import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("funcionarios.csv"))){

            String line = bufferedReader.readLine();

            while (line != null){
                String[] arrayFunc = line.split(",");

                listaFuncionarios.add(new Funcionario(arrayFunc[0], arrayFunc[1], Double.parseDouble(arrayFunc[2])));

                line = bufferedReader.readLine();

            }

            System.out.println("Entre com o salario: ");
            Double salario = scanner.nextDouble();

            Comparator<Funcionario> comp = (x, y) -> x.getEmail().compareToIgnoreCase(y.getEmail());

            List<String> listaEmailFuncionarios = listaFuncionarios.stream().
                    filter(func -> func.getSalario() > salario).
                    map(p -> p.getEmail()).
                    collect(Collectors.toList());


            double salarioTotalFuncM = listaFuncionarios.stream().
                    filter(func -> func.getNome().charAt(0) == 'M').
                    mapToDouble(x -> x.getSalario()).
                    sum();


            System.out.println("EMAIL DE FUNCIONARIOS COM O SALARIO MAIOR QUE "+salario+":");
            listaEmailFuncionarios.forEach(System.out::println);

            System.out.println("SOMA DOS SALARIOS DE FUNCIONARIOS QUE O NOME COMEÇA COM 'M': "+salarioTotalFuncM);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}