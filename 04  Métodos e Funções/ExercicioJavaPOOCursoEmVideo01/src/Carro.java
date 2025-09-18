public class Carro {
    String nomeDono;
    String modeloCarro;
    short anoCarro;
    String corCarro;
    boolean ligado;
    boolean acelerar;

    void credenciais(){
        System.out.println("NOME DO DONO: "+this.nomeDono);
        System.out.println("MODELO DO CARRO: "+this.modeloCarro);
        System.out.println("ANO DO CARRO: "+this.anoCarro);
        System.out.println("COR DO CARRO: "+this.corCarro);
        System.out.println("ESTÁ LIGADO?: "+this.ligado);
        System.out.println("ESTÁ ACELERANDO?: "+this.acelerar);
    }

    void ligarCarro(){
        if (this.ligado == true){
            System.out.print("CARRO LIGADO! \n");
        }
        else{
            System.out.print("CARRO DESLIGADO!! \n");
        }
    }

    void acelerarCarro(){
        if (this.ligado == false){
            System.out.print("O CARRO NÃO PODE ACELERAR POIS ESTÁ DESLIGADO!! \n");
        }
        else if (this.ligado == true && this.acelerar == false){
            System.out.print("CARRO PARADO! \n");
        }
        else{
            System.out.println("CARRO ACELERANDOOOOO!! ");
        }
    }
}
