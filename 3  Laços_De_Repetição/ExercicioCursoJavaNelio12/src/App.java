import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros: ");
        int num = scanner.nextInt();
        int[] vetor = new int[num];

        for (int i = 0; i < vetor.length; i++){
            scanner.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
            
        }

        

        scanner.close();

    }
}
