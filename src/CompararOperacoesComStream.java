import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompararOperacoesComStream {
    List<Integer> listaComparacao = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
    public CompararOperacoesComStream(){

            List<Integer> lista = listaComparacao;

            long inicioSequencial = System.currentTimeMillis();

            long resultadoSequencial = lista.stream()
                    .filter(x -> x % 2 == 0)
                    .map(x -> x * x)
                    .reduce(0, Integer::sum);

            long fimSequencial = System.currentTimeMillis();

            long inicioParalelo = System.currentTimeMillis();

            long resultadoParalelo = lista.parallelStream()
                    .filter(x -> x % 2 == 0)
                    .map(x -> x * x)
                    .reduce(0, Integer::sum);

            long fimParalelo = System.currentTimeMillis();

            System.out.println("\nResultado Sequencial: " + resultadoSequencial);
            System.out.println("Tempo Sequencial: " + (fimSequencial - inicioSequencial) + " ms");

            System.out.println("Resultado Paralelo: " + resultadoParalelo);
            System.out.println("Tempo Paralelo: " + (fimParalelo - inicioParalelo) + " ms\n");

    }

}
