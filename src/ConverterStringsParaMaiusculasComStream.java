import java.util.List;
import java.util.stream.Collectors;

public class ConverterStringsParaMaiusculasComStream {

    private final List<String> listaString;
    public ConverterStringsParaMaiusculasComStream(List<String> listaString) {
        this.listaString = listaString;
        List<String> stringsMaiusculas = listaString.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("\nA lista original é " + listaString
                + "\n    Convertendo para letras maiúsculas teremos " + stringsMaiusculas + ".");
    }
}
