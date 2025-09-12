package utilitarios;

public class Conta {
    private int contaTitular;
    private String nomeTitular;
    private double saldoConta;

    public Conta(int contaTitular, String nomeTitular, double deposito){
        this.contaTitular = contaTitular;
        this.nomeTitular = nomeTitular;
        depositarConta(deposito);
    }

    public Conta(int contaTitular, String nomeTitular){
        this.contaTitular = contaTitular;
        this.nomeTitular = nomeTitular;
        this.saldoConta = 0;
    }

    public void cadastrarConta(){
        System.out.println("Conta criada!");
        mostrarInfo();
    }

    public void mostrarInfo(){
        System.out.println("NUMERO DA CONTA: "+getContaTitular());
        System.out.println("TITULAR: "+getNomeTitular());
        System.out.println("SALDO ATUAL: "+getSaldoConta());
        System.out.println();
    }

    public void depositarConta(double deposito){
        saldoConta += deposito;
    }

    public void sacarSaldo(double saque){
        if (saldoConta <= 0 || saque > saldoConta){
            System.out.println("SALDO INDISPONIVEL NA CONTA! \nFAÇA UM DEPOSITO");
        }
        else{
            saldoConta -= saque;
            saldoConta -= 5;
            System.out.println();

        }
        

    }

    
    /**
     * @return int return the contaTitular
     */
    public int getContaTitular() {
        return contaTitular;
    }

    /**
     * @return String return the nomeTitular
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * @param nomeTitular the nomeTitular to set
     */
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldoConta(){
        return saldoConta;
    }

    
}