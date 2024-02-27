import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ExtrairEstatisticasComStream {
    private final List<Integer> listaInteiros;
    public ExtrairEstatisticasComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        IntSummaryStatistics estatisticas = listaInteiros.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("\nA lista original é " + listaInteiros + "."
                + "\n    Seguem algumas estatísticas da lista: Contagem de elementos: " + estatisticas.getCount()
                + "\n    Somatória: " + estatisticas.getSum()
                + "\n    Média: " + estatisticas.getAverage()
                + "\n    Menor valor:" + estatisticas.getMin()
                + "\n    Maior valor:" + estatisticas.getMax()
                + "\n    Classe do objeto: " + estatisticas.getClass()+ ".");
    }
}
