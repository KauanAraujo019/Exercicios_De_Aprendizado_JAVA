import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que vc irá digitar: ");
        int num = scanner.nextInt();
        double[] vetor = new double[num];
        
        for (int i = 0; i < vetor.length; i++){
            scanner.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.print("VALORES: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        System.out.println();
        System.out.println("SOMA: "+soma);
        System.out.print("MÉDIA: "+soma/vetor.length);








        scanner.close();
    }
}
