package entities;

public class PessoaFisica extends Contribuinte{
    private Double gastosSaude;


    public PessoaFisica(String nome, Double rendaAnual){
        super(nome, rendaAnual);
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude){
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }



    @Override
    public Double calculoImposto() {
        Double imposto;

        if (getRendaAnual() < 20000){
            imposto = getRendaAnual() * 0.15;
            imposto = imposto - (gastosSaude * 0.5);

            return imposto;
        }
        else{
            imposto = getRendaAnual() * 0.25;
            imposto = imposto - (gastosSaude * 0.5);

            return imposto;
        }

    }




    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
}
