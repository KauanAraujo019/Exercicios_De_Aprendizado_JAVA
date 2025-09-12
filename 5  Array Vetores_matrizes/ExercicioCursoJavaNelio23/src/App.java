import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de estudantes: ");
        int num = scanner.nextInt();
        
        QuartoHotel[] inquilino = new QuartoHotel[10];

        for (int i = 1; i <= num; i++){
            scanner.nextLine();
            System.out.println("INQUILINO "+i);
            System.out.print("Digite o nome: ");
            String nomeInquilino = scanner.nextLine();
            System.out.print("Digite o email: ");
            String emailInquilino = scanner.next();
            System.out.print("Digite o quarto: ");
            int quartoInquilino = scanner.nextInt();
            inquilino[quartoInquilino] = new QuartoHotel(nomeInquilino, emailInquilino);

        }

        for (int i = 0; i < inquilino.length; i++){
            if (inquilino[i] != null){
                System.out.println(i+": "+inquilino[i].toString());
            }
        }

        scanner.close();
    }
}
