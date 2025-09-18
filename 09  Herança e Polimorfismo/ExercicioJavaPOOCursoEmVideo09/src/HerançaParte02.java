public class HerançaParte02 {
    public static void main(String[] args) throws Exception {
        Visitante visitante = new Visitante();
        visitante.setNome("mauricio");
        visitante.setIdade(21);
        visitante.setSexo("Masculino");
        visitante.dados();

        Aluno aluno = new Aluno();
        aluno.setNome("Kauan");
        aluno.setIdade(19);
        aluno.setSexo("masculino");
        aluno.setCurso("Analise e desenvolvimento de sistemas");
        aluno.pagarMensalidade();
        aluno.dados();

        Professor professor = new Professor();
        professor.setNome("bacacau");
        professor.setIdade(46);
        professor.setMateria("Engenharia de software");
        professor.setSalario(3250.00f);
        professor.setSexo("masculino");
        professor.receberAumento();
        professor.dados();

        Bolsista bolsista = new Bolsista();
        bolsista.setNome("izabella");
        bolsista.setIdade(15);
        bolsista.setSexo("feminino");
        bolsista.pagarMensalidade();
        bolsista.renovarBolsa();
        bolsista.dados();

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("mariana");
        tecnico.setIdade(29);
        tecnico.setSexo("feminino");
        tecnico.pagarMensalidade();
        tecnico.estagio();
        tecnico.dados();
        
    }
}
