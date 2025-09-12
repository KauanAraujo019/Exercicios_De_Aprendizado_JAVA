package entities;

public class PessoaJuridica extends Contribuinte{
    Integer numFuncionarios;

    public PessoaJuridica(){

    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios){
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }



    @Override
    public Double calculoImposto() {
        Double imposto;

        if (numFuncionarios >= 10){
            imposto = getRendaAnual() * 0.14;

            return imposto;
        }
        else{
            imposto = getRendaAnual() * 0.16;

            return imposto;
        }
    }



    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
}
