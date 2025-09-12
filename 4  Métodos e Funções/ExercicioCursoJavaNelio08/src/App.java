import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       Student estudante = new Student();
       System.out.print("Digite o nome do aluno: ");
       estudante.nome = scanner.nextLine();
       System.out.println("Digite as notas do aluno "+estudante.nome);
       System.out.println("NOTA 1: ");
       estudante.notaBi01 = scanner.nextDouble();
       System.out.println("NOTA 2: ");
       estudante.notaBi02 = scanner.nextDouble();
       System.out.println("NOTA 3: ");
       estudante.notaBi03 = scanner.nextDouble();
       System.out.println("NOTA FINAL DO ALUNO "+estudante.nome+" "+estudante.notaAluno());
       if (estudante.notaAluno() < 60){
        System.out.println("PONTOS EM FALTA: "+estudante.missingPoints());
       }
       else{
        System.out.println("PASS");
       }



       scanner.close();
    }
}
