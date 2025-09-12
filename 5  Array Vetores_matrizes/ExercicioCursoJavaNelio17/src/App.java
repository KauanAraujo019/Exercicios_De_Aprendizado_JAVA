import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros para cada vetor: ");
        int num = scanner.nextInt();
        double[] vetor1 = new double[num];
        double[] vetor2 = new double[num];
        double[] vetor3 = new double[num];

        for (int i = 0; i < vetor1.length; i++){
            System.out.println("Digite os valores do vetor 1:");
            vetor1[i] = scanner.nextDouble();
        }

        System.out.println();
        for (int i = 0; i < vetor2.length; i++){
            System.out.println("Digite os valores do vetor 2: ");
            vetor2[i] = scanner.nextDouble();
        }
        
        System.out.println();
        System.out.println("SOMA DOS VETORES");
        for (int i = 0; i < vetor3.length; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.println(vetor3[i]);
        }



        scanner.close();
    }
}
