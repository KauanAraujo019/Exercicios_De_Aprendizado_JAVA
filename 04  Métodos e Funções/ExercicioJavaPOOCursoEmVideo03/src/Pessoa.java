public class Pessoa {
    private String nomeUsuario;
    private int idadeUsuario;
    private String cidadeUsuario;

    public Pessoa(String nomeUsu, int idadeUsu, String cidadeUsu){
        this.nomeUsuario = nomeUsu;
        this.idadeUsuario = idadeUsu;
        this.cidadeUsuario = cidadeUsu;

    }

    public void metodo(){
        System.out.println("nome do usuario: "+nomeUsuario);
        System.out.println("idade do usuario: "+idadeUsuario);
        System.out.println("cidade do usuario: "+cidadeUsuario+"\n");

    }

}
