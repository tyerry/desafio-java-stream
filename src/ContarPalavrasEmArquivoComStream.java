import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContarPalavrasEmArquivoComStream {

    public ContarPalavrasEmArquivoComStream() {
        List<String> linhasArquivo;
        try {
            linhasArquivo = Files.readAllLines(Paths.get("C:\\Users\\User\\Documents\\alura\\du\\DesafioJavaStream\\src\\texto.txt"));
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");
            return;
        }

        List<String> palavras = linhasArquivo.stream()
                .flatMap(linha -> Arrays.stream(linha.split("\\s+")))
                .map(palavra -> palavra.replaceAll("[^a-zA-Z]", "").toLowerCase())
                .filter(palavra -> !palavra.isEmpty())
                .collect(Collectors.toList());

        long numeroPalavrasUnicas = palavras.stream().distinct().count();

        System.out.println("\nNúmero de palavras únicas no arquivo é: " + numeroPalavrasUnicas);
    }
}
