public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa[] = new Pessoa[4];
        pessoa[0] = new Pessoa("Kauan", 19, "masculino");
        pessoa[1] = new Pessoa("larrisa", 18, "feminino");
        pessoa[2] = new Pessoa("izabella", 15, "feminino");
        pessoa[3] = new Pessoa("calebe", 14, "masculino");

        Livro livro[] = new Livro[2];
        livro[0] = new Livro("Entendendo algoritmos", "ruzemberg sousa",
         25, 0, false, pessoa[0]);
        livro[1] = new Livro("Matematica avançada", "lorenzo silva",
         15, 0, false, pessoa[2]);

        livro[0].abrir();
        livro[0].avançarPag();
        livro[0].avançarPag();
        
        livro[1].abrir();
        livro[1].avançarPag();
        livro[1].avançarPag();

        livro[0].detalhes();
        livro[1].detalhes();
       
        
        


    }
}
