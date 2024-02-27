import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CriarMapaAPartirDeStringsComStream {

    List<String> listaString;
    public CriarMapaAPartirDeStringsComStream(List<String> listaString) {
        this.listaString = listaString;
        Map<String,Integer> mapa = listaString.stream().collect(Collectors.toMap(str -> str, String::length));
        System.out.println("\nA lista original é " + listaString
                + "\n    Convertendo para um mapa onde o valor é a quantidade de caracteres teremos:\n    "
                + mapa + ".");
    }
    
}
