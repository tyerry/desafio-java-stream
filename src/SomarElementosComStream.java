import java.util.List;

public class SomarElementosComStream {

    private final List<Integer> listaInteiros;
    public SomarElementosComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        int totalSomado = listaInteiros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nNa lista " + listaInteiros
                + "\n    A soma dos elementos é " + totalSomado + ".");
    }
}
