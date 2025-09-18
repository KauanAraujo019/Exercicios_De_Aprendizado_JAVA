public class App{
    public static void main(String args[]) throws Exception{

        //cliente 01
        Pessoa cliente01 = new Pessoa();
        cliente01.setNumConta(543234);
        cliente01.setNomeDono("Kauan Araujo");
        cliente01.abrirConta("CC");
        cliente01.depositoConta(500);
        

        //cliente 02
        Pessoa cliente02 = new Pessoa();
        cliente02.setNumConta(543325);
        cliente02.setNomeDono("rezes");
        cliente02.abrirConta("CP");
        cliente02.depositoConta(1000);
        cliente02.sacarConta(1100);
        cliente02.fecharConta();

        
        
        //exibir credenciais
        cliente01.mostrarCred();
        cliente02.mostrarCred();
        
    }
}