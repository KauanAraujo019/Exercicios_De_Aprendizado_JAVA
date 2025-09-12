import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas desejadas: ");
        int num = scanner.nextInt();
        double[] altura = new double[num];
        char[] genero = new char[num];
        double maiorAltura = 0;
        double menorAltura = 3.00;
        double alturaMulheres = 0;
        int totalHomens = 0;
        double quantMulheres = 0;
        char generoFeminino = 'f';

        for (int i = 0; i < altura.length; i++){
            System.out.printf("Digite a altura da %da pessoa: ",i+1);
            altura[i] = scanner.nextDouble();
            System.out.printf("Digite o genero da %da pessoa: ",i+1);
            genero[i] = scanner.next().charAt(0);
            if (genero[i] == generoFeminino){
                alturaMulheres = alturaMulheres + altura[i];
                quantMulheres = quantMulheres + 1;
            }
            else{
                totalHomens = totalHomens + 1;
            }
            

        }

        for (int i = 0; i < num; i++){
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }

            if (altura[i] < menorAltura){
                menorAltura = altura[i];

            }
        }
        
        alturaMulheres = alturaMulheres / quantMulheres;
        System.out.printf("MAIOR ALTURA: %.2f",maiorAltura);
        System.out.println();
        System.out.printf("MENOR ALTURA: %.2f",menorAltura);
        System.out.println();
        System.out.printf("MEDIA ALTURA DAS MULHERES: %.2f",alturaMulheres);
        System.out.println();
        System.out.print("QUANTIDADE DE HOMENS: "+totalHomens);




        scanner.close();
    }
}
