import java.util.List;

public class CalcularProdutoComStream {
    private final List<Integer> listaInteiros;

    public CalcularProdutoComStream(List<Integer> listaInteiros){
        this.listaInteiros = listaInteiros;
        Integer produtoCalculado = listaInteiros.stream().reduce(1, (a,b) -> a * b);
        System.out.println("\nNa lista " + listaInteiros
                + "\n    O produto da multiplicação dos elementos é: " + produtoCalculado + ".");
    }
}
