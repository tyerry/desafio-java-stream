import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparPorComprimentoComStream {
    private final List<String> listaString;

    public AgruparPorComprimentoComStream(List<String> listaString) {
        this.listaString = listaString;
        Map<Integer, List<String>> listaAgrupada = listaString.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("\nA lista original é " + listaString
                + "\n    Agrupando por comprimento teremos:\n    "
                + listaAgrupada + ".");
    }
    
}
