import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros desejados: ");
        int num = scanner.nextInt();
        double[] vetor = new double[num];
        int quantPar = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.print("NUMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                quantPar ++;
                System.out.print(vetor[i]+" ");

            }
        }

        System.out.println();
        System.out.print("NUMEROS PARES: "+quantPar);
        
        scanner.close();
    }
}
