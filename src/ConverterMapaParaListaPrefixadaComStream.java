import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConverterMapaParaListaPrefixadaComStream {
    private final Map<Integer, List<String>> mapa;

    public ConverterMapaParaListaPrefixadaComStream(Map<Integer, List<String>> mapa) {
        this.mapa = mapa;

        List<String> resultadoConversao = mapa.entrySet().stream()
                .flatMap(elemento -> elemento.getValue().stream().map(value -> elemento.getKey() + ":" + value))
                .collect(Collectors.toList());

        System.out.println("\nO mapa original é " + mapa
                + "\n    Convertendo para uma lista onde as chaves se tornam um prefixo, teremos:\n    "
                + resultadoConversao + ".");
    }

}
