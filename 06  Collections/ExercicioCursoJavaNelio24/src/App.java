import entities.Funcionario;
import java.util.Scanner;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("us")); 
        System.out.print("Digite a quantidade de funcionarios: ");
        int numFuncionarios = scanner.nextInt();
        List<Funcionario> lista = new ArrayList<>();
        Funcionario funcionario;
        

        for (int i = 0; i < numFuncionarios; i++){
            scanner.nextLine();
            System.out.println("----------REGISTRO DE FUNCIONÁRIOS----------");
            System.out.println("FUNCIONARIO #"+(i+1));
            System.out.print("Digite o ID: ");
            int IdFunc = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome: ");
            String nomeFunc = scanner.nextLine();
            System.out.print("Digite o salário: ");
            double salarioFunc = scanner.nextDouble();
            funcionario = new Funcionario(IdFunc, nomeFunc, salarioFunc);
            lista.add(funcionario);
            
        }

        System.out.println();
        System.out.print("Digite o ID do funcionario que irá receber o aumento: ");
        int idFuncAumento = scanner.nextInt();
        Integer posicaoFunc = acharPosFunc(lista, idFuncAumento);
        if (posicaoFunc == null){
            System.out.println("ID NAO ENCONTRADO!");
            System.out.println();
        }
        else{
            System.out.print("Digite a porcentagem do aumento do funcionario: ");
            double porcentAumento = scanner.nextDouble();
            lista.get(posicaoFunc).aumentarSalario(porcentAumento);
            System.out.println();
        
        }


        System.out.println("LISTA DE FUNCIONARIOS");
        for (Funcionario funcionarios : lista) {
            System.out.println(funcionarios);
        }


        scanner.close();
    }

    static Integer acharPosFunc(List<Funcionario> listaFun, int id){
        for (int i = 0; i < listaFun.size(); i++){
            if (listaFun.get(i).getId() == id  ){
                return i;
            }
            
        }
        return null;
    }
}
