import java.util.Scanner;

public class App {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.println(i+" "+i*i+" "+i*i*i);
        }

        scanner.close();
    }   
}
