import java.util.Scanner;
import java.math.*;

public class App{
 
    public static void main(String args[]) throws Exception{
      Scanner scanner = new Scanner(System.in);
        float pi =  3.14159f;
        System.out.print("digite o primeiro valor: ");
        float a = scanner.nextFloat();
        System.out.print("digite o segundo valor: ");
        float b = scanner.nextFloat();
        System.out.print("digite o terceiro valor: ");
        float c = scanner.nextFloat();

        float triangulo = (a * c / 2);

        float circulo = ((c * c) * pi);

        float trapezio = ((a + b) * c / 2);

        float quadrado = (b * b);

        float retangulo = (a * b);

        System.out.println();
        System.out.println("TRIANGULO: "+triangulo);
        System.out.println("CIRCULO: "+circulo);
        System.out.println("TRAPEZIO: "+trapezio);
        System.out.println("QUADRADO: "+quadrado);
        System.out.print("RETANGULO: "+retangulo);






  }

}