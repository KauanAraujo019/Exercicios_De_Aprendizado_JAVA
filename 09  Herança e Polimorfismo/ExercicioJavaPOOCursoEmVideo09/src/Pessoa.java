public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniversario(){
        this.idade++;
    }

    public void dados(){
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        System.out.println("sexo: "+this.sexo+"\n");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
