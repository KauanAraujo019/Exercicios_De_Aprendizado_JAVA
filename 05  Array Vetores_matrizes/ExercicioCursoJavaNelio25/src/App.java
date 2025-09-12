import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de N: ");
        int n = scanner.nextInt();
        int[][] numeros = new int[n][n];
        int numNegativos = 0;
        
        for (int i = 0; i < numeros.length; i++){
            for (int z = 0; z < numeros.length; z++){
                System.out.print("Digite o numero: ");
                numeros[i][z] = scanner.nextInt();
                if (numeros[i][z] < 0){
                    numNegativos ++;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++){
            for (int z = 0; z < numeros.length; z++){
                System.out.print(numeros[i][z]+ " ");
                
            }
            System.out.println();
        }

        System.out.println("Diagonais principais: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i][i]);
        }

        System.out.println("NUMEROS NEGATIVOS: "+numNegativos);

        

        










        scanner.close();
    }
}
