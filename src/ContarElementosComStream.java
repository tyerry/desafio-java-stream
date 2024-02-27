import java.util.List;

public class ContarElementosComStream {
    private final List<Integer> listaInteiros;
    public ContarElementosComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        long totalElementos = listaInteiros.stream().count();
        System.out.println("Na lista " + listaInteiros
                + "\n    A quantidade de elementos é " + totalElementos + ".");
    }
}
