import java.util.List;

public class MapearEFiltrarComStream{
    private final List<Produto> listaProdutos;
    
    public MapearEFiltrarComStream(List<Produto> listaProdutos, Integer valorFiltro){
        this.listaProdutos = listaProdutos;
        List<String> produtosFiltrados = listaProdutos.stream().filter(produto -> produto.getPrecoDoItem() > valorFiltro).map(produto -> produto.getNomeDoItem().toUpperCase()).toList();
        System.out.println("\nA lista original é " + listaProdutos.stream().map(produto -> produto.getNomeDoItem() + ": R$" + produto.getPrecoDoItem()).toList()
                + "\n    Filtrando apenas os com preço maior que 100 teremos " + produtosFiltrados + ".");
    }
}

class Produto {
    private String nomeDoItem;
    private Integer precoDoItem;
    Produto(String nomeDoItem, Integer precoDoItem){
        this.nomeDoItem = nomeDoItem;
        this.precoDoItem = precoDoItem;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public Integer getPrecoDoItem() {
        return precoDoItem;
    }
}
