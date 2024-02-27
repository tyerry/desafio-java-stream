import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaInteiros = List.of(-7,-3,-1,1,2,2,2,3,4,5,6,7,7,8,9,10,10,101);
        List<String> listaPalavras = List.of("Camarão","Polvo","golfinho","TUBarÃo","cavalo MARINHO", "eStReLa Do MaR", "BaLEia", "peixe espada");
        List<Produto> listaProdutos = Arrays.asList(
                new Produto("celular",2000),
                new Produto("bicicleta",600),
                new Produto("caderno", 15),
                new Produto("lápis",2),
                new Produto("coca-cola 2l",9)
                );
        Map<Integer, List<String>> mapa = Map.of(
                1, Arrays.asList("java", "python", "C#"),
                2, Arrays.asList("swift", "kotlin"),
                3, Arrays.asList("javascript", "ruby", "pear")
        );

        new ContarElementosComStream(listaInteiros);
        new FiltrarElementosComStream(listaInteiros);
        new ConverterStringsParaMaiusculasComStream(listaPalavras);
        new EncontrarOMenorNumeroComStream(listaInteiros);
        new EncontrarOMaiorNumeroComStream(listaInteiros);
        new SomarElementosComStream(listaInteiros);
        new CriarMapaAPartirDeStringsComStream(listaPalavras);
        new RemoverDuplicatasComStream(listaInteiros);
        new SelecionarPrimeirosElementos(listaInteiros,6);
        new SelecionarUltimoElemento(listaPalavras);
        new AgruparPorComprimentoComStream(listaPalavras);
        new ConcatenarStringsComStream(listaPalavras);
        new MapearEFiltrarComStream(listaProdutos,100);
        new ExtrairEstatisticasComStream(listaInteiros);
        new ParticionarPorParidadeComStream(listaInteiros);
        new EncontrarPrimeiroElementoCondicionalComStream(listaInteiros);
        new CalcularProdutoComStream(listaInteiros);
        new ContarPalavrasEmArquivoComStream();
        new ConverterMapaParaListaPrefixadaComStream(mapa);
        new CompararOperacoesComStream();
    }
}
