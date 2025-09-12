import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            Funcionario Funcionario01 = new Funcionario();
            System.out.print("Digite o nome do funcionario: ");
            Funcionario01.nome = scanner.nextLine();
            System.out.print("Digite o salario bruto do funcionario: ");
            Funcionario01.salarioBruto = scanner.nextDouble();
            System.out.print("Digite a taxa salarial: ");
            Funcionario01.taxa = scanner.nextDouble();
            System.out.print(Funcionario01.toString());
            Funcionario01.aumentarSalarioFuncionario();
            System.out.print(Funcionario01.toString());
            

            
    }
}
