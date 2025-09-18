public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nom, String nac, int idad, float altu, float pes, int vit, int derrot, int empat){
        this.nome = nom;
        this.nacionalidade = nac;
        this.idade = idad;
        this.altura = altu;
        setPeso(pes);
        this.vitorias = vit;
        this.derrotas = derrot;
        this.empates = empat;
    }

    //GETTERS E SETTERS
    public String getNome(){
        return nome;
    }
    public void setNome(String nom){
        this.nome = nom;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionali){
        this.nacionalidade = nacionali;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idad){
        this.idade = idad;
    }

    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(){
        if (this.getPeso() < 58.5){
            this.categoria = "INVALIDO! ABAIXO DO PESO";
        }
        else if (this.getPeso() <= 75.5){
            this.categoria = "PESO LEVE";
        }
        else if (this.getPeso() <= 89.9f){
            this.categoria = "PESO MÉDIO";
        }
        else if (this.getPeso() <= 115.5){
            this.categoria = "PESO PESADO";
        }
        else{
            this.categoria = "INVALIDO! ACIMA DO PESO";
        }
    }


    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }

    //METODOS DA CLASSE
    public void apresentar(){
        System.out.println("----------------------------------------------");
        System.out.println("NOME DO LUTADOR: "+this.getNome());
        System.out.println("IDADE DO LUTADOR: "+this.getIdade());
        System.out.println("PAIS DE NACIONALIDADE: "+this.getNacionalidade());
        System.out.println("VITORIAS: "+this.getVitorias());
        System.out.println("DERROTAS: "+this.getDerrotas());
        System.out.println("EMPATES: "+this.getEmpates());

    }

    public void status(){
        System.out.println("-------------------------------");
        System.out.println("ALTURA DO LUTADOR "+this.getNome()+": "+this.getAltura());
        System.out.println("PESO DO LUTADOR: "+this.getPeso() );
        System.out.println("CATEGORIA: "+this.getCategoria());
        
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

}
