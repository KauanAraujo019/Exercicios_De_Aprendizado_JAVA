public class Tecnico extends Aluno{
    protected String cursoTecnico;
    protected short tempoAtuação;

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome+" está pagando a mensalidade com 50% de desconto. ");
    }

    public void estagio(){
        System.out.println("estagiando... ");
    }

    
    public String getCursoTecnico() {
        return cursoTecnico;
    }

    public void setCursoTecnico(String cursoTecnico) {
        this.cursoTecnico = cursoTecnico;
    }

    public short getTempoAtuação() {
        return tempoAtuação;
    }

    public void setTempoAtuação(short tempoAtuação) {
        this.tempoAtuação = tempoAtuação;
    }

    
}
