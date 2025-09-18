public abstract class Animal{
    private int idade;
    private int membros;
    private float peso;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void somDoAnimal();


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    
}