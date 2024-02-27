import java.util.List;
import java.util.Optional;

public class EncontrarPrimeiroElementoCondicionalComStream{
    private final List<Integer> listaInteiros;

    public EncontrarPrimeiroElementoCondicionalComStream(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
        Integer primeiroCondicional = listaInteiros.stream().filter(n -> n > 10 && n % 2 != 0).findFirst().orElse(null);
        System.out.println("\nNa lista " + listaInteiros
                + "\n    O primeiro número ímpar e maior que 10 é: " + primeiroCondicional + ".");
    }
}
