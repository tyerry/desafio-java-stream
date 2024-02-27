import java.util.List;

public class EncontrarOMaiorNumeroComStream {
    private final List<Integer> listaInteiros;
    public EncontrarOMaiorNumeroComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        Integer menorNumero = listaInteiros.stream().max(Integer::compareTo).orElse(null);
        System.out.println("Na lista " + listaInteiros
                + "\n    O maior número é " + menorNumero + ".");
    }
}
