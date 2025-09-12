import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros desejados: ");
        int num = scanner.nextInt();
        double[] numeros = new double[num];
        double mediaPar = 0;
        int contadorPares = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
            if (numeros[i] % 2 == 0){
                mediaPar += numeros[i];
                contadorPares ++;
            }

        }

        mediaPar = mediaPar / contadorPares;
        if (mediaPar != 0){
            System.out.printf("MEDIA DOS PARES: %.1f",mediaPar);
        }
        else{
            System.out.println("NENHUM NUMERO PAR! ");
        }

        scanner.close();
    }
}
