import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConcatenarStringsComStream {
    private final List<String> listaString;

    public ConcatenarStringsComStream(List<String> listaString) {
        this.listaString = listaString;
        String stringsConcatenadas = listaString.stream().collect(Collectors.joining(", "));
        System.out.println("\nA lista original é " + listaString
                + "\n    Concatenando as strings separadas por vírgula teremos:\n    "
                + stringsConcatenadas + ".");
    }
    
}
