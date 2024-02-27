import java.util.List;
import java.util.stream.Stream;

public class FiltrarElementosComStream {

    private final List<Integer> listaInteiros;

    public FiltrarElementosComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        List<Integer> elementosPares = listaInteiros.stream().filter(e -> e % 2 == 0).toList();
        System.out.println("\nNa lista " + listaInteiros
                + "\n    Os números pares são " + elementosPares + ".");
    }
}
