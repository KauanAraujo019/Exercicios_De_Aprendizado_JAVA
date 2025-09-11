import java.util.Scanner;

import utilitarios.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numConta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o primeiro nome do titular da conta: ");
        String titularConta = scanner.nextLine();
        System.out.print("Deseja fazer um deposito?: S/N");
        String resp = scanner.nextLine();
        Conta contaUsuario01;
        if (resp.equalsIgnoreCase("s")){
            System.out.println("Digite o valor do deposito: ");
            double depositoUsuario = scanner.nextDouble();
            contaUsuario01 = new Conta(numConta, titularConta, depositoUsuario);
            contaUsuario01.cadastrarConta();
        }
        else{
            contaUsuario01 = new Conta(numConta, titularConta);
            contaUsuario01.cadastrarConta();
        }
        

        System.out.print("AREA DE DEPOSITOS: \nDigite um valor para deposito: ");
        double depositoUsu = scanner.nextDouble();
        contaUsuario01.depositarConta(depositoUsu);
        contaUsuario01.mostrarInfo();
        System.out.print("AREA DE SAQUES: \nDigite um valor para saque: ");
        double saqueUsuario = scanner.nextDouble();
        contaUsuario01.sacarSaldo(saqueUsuario);
        contaUsuario01.mostrarInfo();;
        
        
        





        scanner.close();
    }
}
