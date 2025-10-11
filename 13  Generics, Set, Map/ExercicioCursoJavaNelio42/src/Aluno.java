import java.util.Objects;

public class Aluno {

    private Integer codigoAluno;

    public Aluno(Integer codigoAluno){
        this.codigoAluno = codigoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigoAluno, aluno.codigoAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoAluno);
    }


    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
}
