import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProfessorAlex professorAlex = new ProfessorAlex();

        System.out.print("How many students for course A: ");
        int quantA = scanner.nextInt();
        for (int i = 0; i < quantA; i++){
            System.out.println("Digite: ");
            professorAlex.addAlunos(new Aluno(scanner.nextInt()));
        }


        System.out.print("How many students for course B: ");
        int quantB = scanner.nextInt();
        for (int i = 0; i < quantB; i++){
            System.out.println("Digite: ");
            professorAlex.addAlunos(new Aluno(scanner.nextInt()));
        }

        System.out.print("How many students for course C: ");
        int quantC = scanner.nextInt();
        for (int i = 0; i < quantC; i++){
            System.out.println("Digite: ");
            professorAlex.addAlunos(new Aluno(scanner.nextInt()));
        }


        System.out.println("TOTAL STUDENTS: "+professorAlex.listaAlunos.size());






    }
}