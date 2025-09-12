public class Aluno {
    public String nome;
    public static int totalAlunos;

    public Aluno(String nome){
        this.nome = nome;

        totalAlunos ++;
    }
    
    public void apresentar(){
        System.out.println("Olá, meu nome é: "+nome);
    }

    public static double totalDeAlunos(){
        return totalAlunos;
    }

}