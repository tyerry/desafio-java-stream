import java.util.List;

public class SelecionarUltimoElemento{
    private final List<?> lista;

    public SelecionarUltimoElemento(List<?> lista) {
        this.lista = lista;
        List<?> ultimoElementos = lista.stream().skip(lista.size() - 1).toList();
        System.out.println("\nA lista original é " + lista
                + "\n    Filtrando apenas o último elemento teremos " + ultimoElementos + ".");
    }
    
}
