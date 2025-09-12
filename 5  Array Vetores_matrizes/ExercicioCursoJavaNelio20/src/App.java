import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros desejados: ");
        int num = scanner.nextInt();
        String[] nome = new String[num];
        double[] idade = new double[num];
        double maiorIdade = 0;
        String pessoaMaisVelha = "";


        
        for (int i = 0; i < nome.length; i++){
            scanner.nextLine();
            System.out.printf("Digite o nome da %da Pessoa: ", i+1);
            nome[i] = scanner.nextLine();
            System.out.printf("Digite a idade da %da Pessoa: ",i+1);
            idade[i] = scanner.nextDouble();
            System.out.println();
            if (idade[i] > maiorIdade){
                maiorIdade = idade[i];
                pessoaMaisVelha = nome[i];
            }

        }

        System.out.println("PESSOA MAIS VELHA: "+pessoaMaisVelha);
        
        scanner.close();
    }
}
