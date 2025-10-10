import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

public class ClienteMarketplace extends Usuario{
    private String nomeCliente;
    private int idCliente;
    private List<Produto> listaProdutos = new ArrayList<>();

    public ClienteMarketplace(String email, String senha, String nomeCliente, int idCliente) {
        super(email, senha);
        this.nomeCliente = nomeCliente;
        this.idCliente = idCliente;
    }

    public void addProdutoNoCarrinho(Produto produto){
        listaProdutos.add(produto);
    }

    public void mostrarCarrinho(){
        for (Produto produto : listaProdutos){
            System.out.println(produto.getNomeProduto());
        }

    }




    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
