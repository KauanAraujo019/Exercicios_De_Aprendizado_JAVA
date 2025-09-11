import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);
    public String nome;
    public double taxa;
    public double salarioBruto;
    

    public void aumentarSalarioFuncionario(){
        System.out.print("qual a porcentagem de aumento do funcionario?: ");
        double porcentagemAumento = scanner.nextDouble();
        salarioBruto = salarioBruto + (salarioBruto * (porcentagemAumento / 100));
        
    }

    public String toString(){
        Double salarioLiquido = salarioBruto - taxa;
        return String.format("Funcionario %s | Salario liquido: %.2f%n",nome, salarioLiquido);
                
    }
}