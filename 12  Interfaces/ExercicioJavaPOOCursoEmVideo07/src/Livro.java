public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }   


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    
    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    
    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    
    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        if (this.getAberto() == true){
            System.out.println("Livro aberto!");
            System.out.println(leitor.getNome()+" está lendo");
            System.out.println("Titulo: "+this.getTitulo());
            System.out.println("Autor: "+this.getAutor());
            System.out.println("Paginas total: "+this.getTotPaginas());
            System.out.println("pagina atual de leitura: "+this.getPagAtual()+"\n");
        }
        else{
            System.out.println("OPS! Livro fechado! \n");
        }
    }

    @Override
    public void abrir() {
        if (!this.getAberto()){
            this.setAberto(true);
            System.out.println("Abrindo livro... ");
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto()){
            this.setAberto(false);
            System.out.println("Fechando livro... ");
        }
    }

    @Override
    public void folhear() {
        if (this.getAberto()){
            System.out.println("Folheando... ");
            if (this.getPagAtual() > this.getTotPaginas()){
                System.out.println("FIM DO LIVRO! ");
            }
        }
    }

    @Override
    public void avançarPag() {
       if (this.getAberto()){
        System.out.println("Proxima pagina... ");
        this.setPagAtual(this.getPagAtual()+1);
            if (this.getPagAtual() > this.totPaginas){
                System.out.println("FIM DO LIVRO");
            }
       }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()){
            System.out.println("Voltando a pagina anterior... ");
            this.setPagAtual(this.getPagAtual()-1);
        }
    }

}