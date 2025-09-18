public class Pessoa {
    public String nomePessoa;
    public short idadePessoa;
    protected int dataNascPessoa;
    private String cpfPessoa;


    public void credenciais(){
        System.out.println("USUARIO: "+this.nomePessoa);
        System.out.println("IDADE: "+this.idadePessoa);
        System.out.println("DATA DE NASCIMENTO: "+this.dataNascPessoa);
        System.out.println("CPF USUARIO: "+getCpfPessoa());
        
    }

    public String getCpfPessoa(){
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpf){
        this.cpfPessoa = cpf;
    }
}
