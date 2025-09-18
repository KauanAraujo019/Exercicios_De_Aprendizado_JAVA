public class Bolsista extends Aluno{
    protected float bolsa;

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome+" possui bolsa 100%! mensalidade paga!");

    }

    public void renovarBolsa(){
        System.out.println(this.nome+" está renovando a bolsa com "+getBolsa());
    }


    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }


}
