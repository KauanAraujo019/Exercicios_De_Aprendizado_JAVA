package entities;

import model.exceptions.ExceptionClass;

public class Conta {
    private int numConta;
    private String titConta;
    private Double saldoConta;
    private Double limiteConta;


    public Conta() {

    }

    public Conta(int numConta, String titConta, Double saldoConta, Double limiteConta) {
        this.numConta = numConta;
        this.titConta = titConta;
        this.saldoConta = saldoConta;
        this.limiteConta = limiteConta;

    }

    public String sacarSaldo(Double saqueConta) throws ExceptionClass{
        if (saqueConta > limiteConta){
            throw new ExceptionClass("Limite da conta excedido!");
        }

        if (saqueConta > saldoConta){
            throw new ExceptionClass("Saldo indisponivel!");
        }

        saldoConta += saldoConta - saqueConta;


        return "Saque Efetivado! \n" +
                "SALDO ATUAL: "+saldoConta;

    }







    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitConta() {
        return titConta;
    }

    public void setTitConta(String titConta) {
        this.titConta = titConta;
    }

    public Double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(Double limiteConta) {
        this.limiteConta = limiteConta;
    }

}
