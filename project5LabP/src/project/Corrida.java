package project;

import java.io.FileNotFoundException;

//import org.jfree.data.xy.XYDataset;

import project.comparators.*;

/**
 * Guarda todos os dados de uma corrida e fornece métodos para analisar esses dados
 */
public class Corrida {
    
    /**
     * Tempo de passagem de um atleta que não passou num posto, medido em minutos desde a partida
     * 
     * É um valor arbitrário que corresponde a 100 horas, muito superior ao tempo limite.
     * Aplica-se também a um atleta que não tenha chegado à meta, através da constante
     * TEMPO_DE_QUEM_NAO_CHEGOU_A_META.
     */
    public static final int MINUTOS_DE_QUEM_NAO_PASSOU = 6000;
    
    /**
     * Tempo de chegada de um atleta que não chegou à meta, expresso em {horas, minutos, segundos} desde a partida.
     * 
     * É um valor arbitrário consistente com MINUTOS_DE_QUEM_NAO_PASSOU.
     */
    public static final int[] TEMPO_DE_QUEM_NAO_CHEGOU_A_META = {MINUTOS_DE_QUEM_NAO_PASSOU / 60,
            MINUTOS_DE_QUEM_NAO_PASSOU % 60, 0};
    
    /**
     * Posição final de um atleta que não chegou à meta.
     * 
     * É um valor arbitrário, muito superior ao número de atletas em prova.
     * Serve para a posição absoluta e para a posição por escalão.
     */
    public static final int POSICAO_DE_QUEM_NAO_CHEGOU_A_META = 9999;
    
    // Todos os atletas que se apresentaram à partida, por ordem crescente de número de dorsal
    private final Atleta[] atletas;
    
    // Cada linha de registosPassagem corresponde a um posto de controlo.
    // Após leitura dos dados de ficheiroRegistoPassagens e processamento desses dados, cada linha deve ficar ordenada
    // por ordem crescente de tempo de passagem.
    private final RegistoPassagem[][] registosPassagem;

    public Corrida(String ficheiroListaAtletas, String ficheiroClassificacoes, String ficheiroRegistoPassagens) throws FileNotFoundException{

    }

    public Atleta[] getAtletas(){
    // Devolve um array com todos os atletas ordenados por ordem crescente de dorsal.
    }

    public Atleta getAtletaPorIndice(int indice){
    //Devolve o atleta que está na posição correspondente ao índice dado, no array que contém todos os atletas ordenados por ordem crescente de dorsal.
    }

    public RegistoPassagem[][] getRegistosPassagem(){
    //Devolve a matriz de registos de passagem, cujo formato está descrito no ficheiro Corrida.java.
    }

    public int getNumeroDeAtletas(){
    //Para a corrida UTMB 2023, deve devolver 2687. Para outras corridas, dependerá do conteúdo dos respectivos ficheiros starters.
    }

    public int getNumeroPostosControlo(){
    //Para a corrida UTMB 2023, deve devolver 24. Para outras corridas, dependerá do conteúdo dos respectivos ficheiros progress.
    }

    public int[] calculaPosicoesPostos(int dorsal){
    //Calcula e devolve um array contendo as posições em que o atleta com o dorsal dado passou em cada um dos postos. 
    //O array devolvido tem portanto tamanho igual ao número de postos. 
    //Caso um atleta não tenha passado num certo posto, a posição calculada nesse posto é indeterminada: a única exigência é de que seja superior à posição do último atleta que efetivamente passou no posto. 
    //Obviamente não podemos confiar nesse número para nenhum efeito prático.
    }

    public void plotPosicoesPostos(Atleta[] vec){
    //Sendo vec um array de tamanho arbitrário, o método mostra uma janela com um gráfico em que estão sobrepostas as séries de posições de cada atleta ao longo dos postos de controlo.
    //Observe o exemplo output/atleta700_vs_atleta1000.png para conhecer o formato pretendido para o gráfico.
    //Caso um atleta não tenha passado num certo posto, a posição exibida nesse posto não tem validade, como explicado no método calculaPosicoesPostos.
    }

    public void plotPosicoesPostos(int[] dorsais){
    //Comporta-se como o método anterior, excepto que são apenas passados os dorsais de cada atleta, e não o objecto Atleta completo.
    }
}

