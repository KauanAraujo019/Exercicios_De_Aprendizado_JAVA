package Application;

import entities.Conta;
import model.exceptions.ExceptionClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

            System.out.println("Entre com os dados da conta:");
            System.out.print("Numero da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Titular: ");
            String nomeTitular = scanner.nextLine();
            System.out.print("Valor inicial: ");
            Double saldoInicial = scanner.nextDouble();
            System.out.print("Limite de saque: ");
            Double limiteSaque = scanner.nextDouble();
            System.out.println();
            Conta novaConta = new Conta(numeroConta, nomeTitular, saldoInicial, limiteSaque);

            System.out.println("Digite o valor para saque: ");
            Double valorSaque  = scanner.nextDouble();


            System.out.println(novaConta.sacarSaldo(valorSaque));


        }catch (ExceptionClass e){
            System.out.println("Erro ao sacar! "+e.getMessage());
        }catch (InputMismatchException inp){
            System.out.println("Erro! Valor invalido! ");
        }finally {
            System.out.println("Encerrando...");
        }










    }
}