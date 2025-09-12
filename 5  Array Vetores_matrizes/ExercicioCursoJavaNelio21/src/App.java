import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int num = scanner.nextInt();
        String[] nomeAluno = new String[num];
        double[] nota1 = new double[num];
        double[] nota2 = new double[num];
        double[] mediaAluno = new double[num];

        for (int i = 0; i < nomeAluno.length; i++){
            scanner.nextLine();
            System.out.printf("Digite o nome do %da Aluno: ",i+1);
            nomeAluno[i] = scanner.nextLine();
            System.out.printf("Digite a primeira nota do %da Aluno: ",i+1);
            nota1[i] = scanner.nextDouble();
            System.out.printf("Digite a segunda nota do %da Aluno: ",i+1);
            nota2[i] = scanner.nextDouble();

        }

        System.out.println("ALUNOS APROVADOS ");
        for (int i = 0; i < nomeAluno.length; i++){
            mediaAluno[i] = nota1[i] + nota2[i] / 2;
            if (mediaAluno[i] >= 6.0){
                System.out.println(nomeAluno[i]);
            }
        }



        scanner.close();
    }   
}
