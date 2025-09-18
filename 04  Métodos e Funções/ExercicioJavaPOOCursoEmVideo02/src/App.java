public class App{
    public static void main(String args[]) throws Exception{
        Pessoa usuario = new Pessoa();
        usuario.nomePessoa = "Kauan de aquino araujo";
        usuario.idadePessoa = 19;
        usuario.dataNascPessoa = 12122004;
        usuario.setCpfPessoa("000000000010");
        usuario.credenciais();
    }
}