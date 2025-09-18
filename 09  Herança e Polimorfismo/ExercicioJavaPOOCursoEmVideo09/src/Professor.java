public class Professor extends Pessoa{
    protected float salario;
    protected String materia;

    public void receberAumento(){
        System.out.println(this.nome+" recebeu um aumento! ");
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    

}