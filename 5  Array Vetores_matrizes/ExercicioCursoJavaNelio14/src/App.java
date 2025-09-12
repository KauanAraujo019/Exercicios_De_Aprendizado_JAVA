import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros propostos: ");
        int num = scanner.nextInt();
        String[] nome = new String[num];
        int[] idade = new int[num];
        double[] altura = new double[num];
        double totalmediaAltura = 0;
        double porcentMenorIdades = 0;
        
        


        for (int i = 0; i < nome.length; i++){
            scanner.nextLine();
            System.out.println("Digite os dados da "+(i+1)+"a Pessoa");
            System.out.println("Digite o nome: ");
            nome[i] = scanner.nextLine();
            System.out.println("Digite a idade: ");
            idade[i] = scanner.nextInt();
            if (idade[i] < 16){
                porcentMenorIdades ++;
            
                
            }
            System.out.println("Digite a altura: ");
            altura[i] = scanner.nextDouble();
            totalmediaAltura += altura[i];



        }

        System.out.println("Altura média: "+totalmediaAltura/altura.length);

        porcentMenorIdades = (porcentMenorIdades / idade.length) * 100;
        System.out.println("Pessoas com menos de 16 anos: "+porcentMenorIdades+"%");
        for (int i = 0; i < idade.length; i++){
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
        


        scanner.close();
    }
}
