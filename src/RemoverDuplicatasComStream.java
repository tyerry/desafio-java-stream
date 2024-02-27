import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoverDuplicatasComStream {

    List<Integer> listaInteiros;
    public RemoverDuplicatasComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        List<Integer> listaSemDuplicatas = listaInteiros.stream().distinct().toList();
        System.out.println("\nA lista original é " + listaInteiros
                + "\n    Removendo as duplicadas teremos " + listaSemDuplicatas + ".");
    }
    
}
