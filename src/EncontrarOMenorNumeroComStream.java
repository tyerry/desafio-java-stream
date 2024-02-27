import java.util.List;

public class EncontrarOMenorNumeroComStream {
    private final List<Integer> listaInteiros;
    public EncontrarOMenorNumeroComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        Integer menorNumero = listaInteiros.stream().min(Integer::compareTo).orElse(null);
        System.out.println("\nNa lista " + listaInteiros
                + "\n    O menor número é " + menorNumero + ".");
    }
}
