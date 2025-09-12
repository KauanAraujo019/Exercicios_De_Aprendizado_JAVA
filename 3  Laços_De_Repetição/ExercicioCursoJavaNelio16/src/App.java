import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros desejadas: ");
        int num = scanner.nextInt();
        double[] numeros = new double[num];
        double numRef = 0;
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > numRef){
                numRef = numeros[i];
                posicao = i;
            }

        }

        System.out.println("NUMERO MAIOR: "+numRef);
        System.out.println("POSIÇÃO: "+posicao);



        scanner.close();
    }
}
