public class ProjectPessoal01{
    public static void main(String args[]) throws Exception{
        Carro meuCarro = new Carro();
        meuCarro.nomeDono = "Kauan Araujo";
        meuCarro.modeloCarro = "Camaro";
        meuCarro.corCarro = "Preto";
        meuCarro.anoCarro = 2023;
        meuCarro.ligado = true;
        meuCarro.acelerar = false;

        meuCarro.credenciais();
        meuCarro.ligarCarro();
        meuCarro.acelerarCarro();
    }
}