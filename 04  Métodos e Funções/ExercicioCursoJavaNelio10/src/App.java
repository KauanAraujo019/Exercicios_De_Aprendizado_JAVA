public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Kauan");
        aluno1.apresentar();
        Aluno aluno2 = new Aluno("Jóse");
        aluno2.apresentar();
        Aluno aluno3 = new Aluno("Fernando");
        aluno3.apresentar();
        Aluno aluno4 = new Aluno("Renato");
        aluno4.apresentar();

        System.out.println("TOTAL DE ALUNOS: "+Aluno.totalDeAlunos());


    }
}
