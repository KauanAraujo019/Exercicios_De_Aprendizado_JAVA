public class Aluno extends Pessoa{
    protected int matricula;
    protected String curso;

    public void pagarMensalidade(){
        System.out.println(this.nome+" está pagando a mensalidade do curso de "+this.curso);
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    

}