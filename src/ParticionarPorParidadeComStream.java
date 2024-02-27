import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParticionarPorParidadeComStream {
    private final List<Integer> listaInteiros;
    public ParticionarPorParidadeComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        Map<Boolean, List<Integer>> numerosParticionados = listaInteiros.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("\nNa lista " + listaInteiros
                + "\n    Os elementos pares são: " + numerosParticionados.get(true) + "."
                + "\n    Os elementos ímpares são: " + numerosParticionados.get(false) + ".");

    }
    
}
