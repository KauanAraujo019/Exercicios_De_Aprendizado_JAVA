import java.util.HashSet;
import java.util.Set;

public class ProfessorAlex implements Cursos{
    Set<Aluno> listaAlunos = new HashSet<>();


    @Override
    public void addAlunos(Aluno aluno) {
        listaAlunos.add(aluno);
    }


}
