public class Pessoa{
    public int numConta;
    protected String tipoConta;
    private String nomeDono;
    private float saldoConta;
    private boolean statusConta;


    public void mostrarCred(){
        System.out.println(" ");
        System.out.println("numero da conta: "+getNumConta());
        System.out.println("tipo da conta: "+getTipoConta());
        System.out.println("Dono da conta: "+getNomeDono());
        System.out.println("Saldo atual: "+getSaldoConta());
        System.out.println("Status da conta: "+getStatusConta());
        System.out.println(" ");
    }


    public void setNumConta(int num){
        this.numConta = num;
    }

    public int getNumConta(){
        return numConta;
    }


    public void setTipoConta(String tipoC){
        this.tipoConta = tipoC;
    }

    public String getTipoConta(){
        return tipoConta;
    }


    public void setNomeDono(String nomeD){
        this.nomeDono = nomeD;
    }

    public String getNomeDono(){
        return nomeDono;
    }


    public void setSaldoConta(float saldoC){
        this.saldoConta = saldoC;
    }

    public float getSaldoConta(){
        return saldoConta;
    }


    public void setStatusConta(boolean statusC){
        this.statusConta = statusC;
    }

    public boolean getStatusConta(){
        return statusConta;
    }


    public void abrirConta(String a){

        if (a == "CC" || a == "CP"){
            setStatusConta(true);
            System.out.println("Conta Aberta Com Sucesso!! ");
        }

        if (a == "CC"){
            setSaldoConta(50);
        }
        else if(a == "CP"){
            setSaldoConta(100);
        }
        else{
            System.out.println("tipo de conta invalida. ");
        }
    }


    public void fecharConta(){
        if (saldoConta > 0){
            System.out.print("não é possivel fechar! Saldo em conta! "+getNomeDono());
        }
        else if (saldoConta < 0){
            System.out.print("não foi possivel fechar a conta, pois possui débito rotativo. "+getNomeDono());   
        }
        else{
            this.statusConta = false;
            System.out.print("CONTA FECHADA! "+getNomeDono());
        }
        System.out.println(" ");
    }


    public void depositoConta(int d){
        if (statusConta == true){
            System.out.println("o deposito foi concluido "+getNomeDono()+"!");
            saldoConta = saldoConta+d;
         }
        else{
            System.out.println("conta não encontrada! ");
        }
    }


    public void sacarConta(int s){
        if (statusConta == true){
            if (saldoConta >= 0 && s <= saldoConta){
                saldoConta = saldoConta - s;
                System.out.println("saque realizado com sucesso "+getNomeDono()+ " saldo atual: R$"+this.saldoConta);
            }
            else{
                System.out.println("SALDO INSUFICIENTE! "+getNomeDono());
            } 
        }
        else{
            System.out.println("CONTA NÃO LOCALIZADA! ");
        }
    }


    public void pagarMensal(){
        int v = 0;
        if (getTipoConta() == "CC"){
            v = 10;
        }
        else if (getTipoConta() == "CP"){
            v = 20;
        }
        if (getStatusConta()){
            this.setSaldoConta(this.getSaldoConta() - v);
            System.out.println("mensalidade paga! ");
        }
        else{
            System.out.println("erro! conta fechada! ");
        }
    }

    
}