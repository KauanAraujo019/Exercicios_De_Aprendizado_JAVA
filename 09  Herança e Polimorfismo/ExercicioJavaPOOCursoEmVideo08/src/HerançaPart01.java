public class HerançaPart01 {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Adolecente adolecente = new Adolecente();
        Adulto adulto = new Adulto();

        adolecente.dormirAteTarde();
        adolecente.setIdade(14);
        adolecente.fazerAniversario();
        adolecente.castigo();

        adulto.setNomeDaProfissao("programador");
        adulto.setDDDcnh(711414);
        adulto.setIdade(42);
        adulto.fazerAniversario();
        adulto.trabalhar();


    }  
}
