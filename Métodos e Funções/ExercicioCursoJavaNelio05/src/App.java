import java.util.Scanner;

public class App {

    public static int calcularTriangulo(int a, int b, int c){
        int soma = (a + b + c) / 2;
        int soma01 = soma * (soma - a) * (soma - b) * (soma * c);
        int resultado = (int)Math.sqrt(soma01);
        return resultado;

    } 
    

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------TRIANGULO 1------------");
        System.out.print("Digite o primeiro lado do triangulo: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o segundo lado do triangulo: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado do triangulo: ");
        int lado3 = scanner.nextInt();

        int resultadoTriangulo01 = calcularTriangulo(lado1, lado2, lado3);
        System.out.print("\033c");

        System.out.println("----------TRIANGULO 2---------------");
        System.out.print("Digite o primeiro lado do triangulo: ");
        int lado01 = scanner.nextInt();
        System.out.print("Digite o primeiro lado do triangulo: ");
        int lado02 = scanner.nextInt();
        System.out.print("Digite o primeiro lado do triangulo: ");
        int lado03 = scanner.nextInt();

        calcularTriangulo(lado01, lado02, lado03);

        int resultadoTriangulo02 = calcularTriangulo(lado01, lado02, lado03);
        System.out.println();


        System.out.println("Tamanho da area de Triangulo 1 "+resultadoTriangulo01);
        System.out.println("Tamanho da area de Triangulo 2 "+resultadoTriangulo02);

        if (resultadoTriangulo01 > resultadoTriangulo02){
            System.out.println("Largger: TRIANGULO 1");
        }
        else{
            System.out.println("Largger: TRIANGULO 2");
        }

        

        scanner.close();

        
       
    }
}
