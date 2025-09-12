import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros desejadas: ");
        int num = scanner.nextInt();
        double[] numeros = new double[num];
        double totMedia = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
            totMedia += numeros[i];
        }      
        
        totMedia = totMedia / numeros.length;
        System.out.printf("MÉDIA DOS NUMEROS: %.3f",totMedia);
        System.out.println();
        System.out.println("NUMEROS ABAIXO DA MÉDIA");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < totMedia){
                System.out.println(numeros[i]);
            }
        }






        scanner.close();

    }
}
