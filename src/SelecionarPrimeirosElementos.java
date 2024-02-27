import java.util.List;

public class SelecionarPrimeirosElementos {
    private final List<?> lista;

    public SelecionarPrimeirosElementos(List<?> lista, Integer limite) {
        this.lista = lista;
        List<?> primeirosElementos = lista.stream().limit(limite).toList();
        System.out.println("\nA lista original é " + lista
                + "\n    Filtrando apenas os primeiros elementos teremos " + primeirosElementos + ".");
    }
}
