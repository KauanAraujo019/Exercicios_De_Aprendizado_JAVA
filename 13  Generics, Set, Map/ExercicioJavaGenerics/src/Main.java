import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<? super Usuario> listaUsuariosSistema = new ArrayList<>();

        ClienteMarketplace cliente01 = new ClienteMarketplace("araujokauan@gmail.com", "42434", "Kauan Araujo", 2292939);
        Usuario usuario01 = new Usuario("Kauanaraujo@", "343435");

        listaUsuariosSistema.add(cliente01);
        listaUsuariosSistema.add(usuario01);

        cliente01.addProdutoNoCarrinho(new Produto("feijao carioca", 9.99, 5));
        cliente01.addProdutoNoCarrinho(new Produto("mandioca", 8.49, 5));
        cliente01.addProdutoNoCarrinho(new Produto("arroz branco", 28.99, 5));
        cliente01.addProdutoNoCarrinho(new Produto("carne bovina tipo picanha", 64.99, 5));

        cliente01.mostrarCarrinho();




    }




}