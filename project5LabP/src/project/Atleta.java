package project;

import java.util.Arrays;
import java.util.Comparator;

public class Atleta implements Comparable<Atleta> {
    
    private final int dorsal; // usado na comparação de Atletas por omissão através do compareTo()
    private final String nome;
    private final String nacionalidade;
    private final String escalao;
    private int posicaoFinalAbsoluta;
    private int posicaoFinalEscalao;
    private int[] tempoNaMeta; // {horas, minutos, segundos}
    private int[] temposPassagem;  // tempos de passagem nos postos de controlo, em minutos desde a partida
    
    public Atleta(int dorsal, String nome, String nacionalidade, String escalao){
        this.dorsal = dorsal;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.escalao = escalao;
        this.posicaoFinalAbsoluta = Corrida.POSICAO_DE_QUEM_NAO_CHEGOU_A_META; //n percebo pq sao inicializados com estes valores
        this.posicaoFinalEscalao = Corrida.POSICAO_DE_QUEM_NAO_CHEGOU_A_META;
        this.tempoNaMeta = Corrida.TEMPO_DE_QUEM_NAO_CHEGOU_A_META;
        this.temposPassagem = new int[0];
    }
    public int getDorsal(){
        return dorsal;
    }
    public String getNome(){
        return nome;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public String getEscalao(){
        return escalao;
    }
    public int getPosicaoFinalAbsoluta(){
        return posicaoFinalAbsoluta;
    }
    public int getPosicaoFinalEscalao(){
        return posicaoFinalEscalao;
    }
    public int[] getTempoNaMeta(){
        return tempoNaMeta;
    }
    public int[] getTemposPassagem(){
        return temposPassagem;
    }
    public void setPosicaoFinalAbsoluta(int posicaoFinalAbsoluta){
        this.posicaoFinalAbsoluta = posicaoFinalAbsoluta;
    }
    public void setPosicaoFinalEscalao(int posicaoFinalEscalao){
        this.posicaoFinalEscalao = posicaoFinalEscalao;
    }
    public void setTempoNaMeta(int[] tempoNaMeta){
        this.tempoNaMeta = tempoNaMeta;
    }
    public void setTemposPassagem(int[] temposPassagem){
        this.temposPassagem = temposPassagem;
    }
    public int compareTo(Atleta outro){
        //Induz uma ordem “natural” ou por omissão em Atleta, em que os atletas são comparados por número de dorsal. 
        //Note que existem duas versões do método ordena, e apenas uma delas usa este compareTo. 
        //A outra versão usa um Comparator (ver mais abaixo).
        return Integer.compare(this.dorsal, outro.dorsal);
    }

    public int hashCode(){
        //Acompanha a inclusão do método compareTo.
        return this.dorsal;

    }
   
    public boolean equals(Object obj){
        //Também incluído por coerência com o compareTo.
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Atleta atleta = (Atleta) obj;
        return this.dorsal == atleta.dorsal;

    }
    public static void ordena(Atleta[] vec){
    //Ordena o array vec usando a ordem “natural” induzida pelo compareTo, ou seja, ordem crescente de número de dorsal.
        Arrays.sort(vec);
    }
    public static void ordena(Atleta[] vec, Comparator<Atleta> comparador){
    //Ordena o array vec por ordem crescente usando um dos vários comparators disponíveis para
    //Atleta. Um desses comparators, que é o ComparaAtletaDorsal, tem o mesmo efeito que usar
    //a ordem por omissão do compareTo.
    }
    public static int indiceAtletaPorNome(Atleta[] vec, String nome){
    //Não assume nada sobre a ordenação de vec, nem sobre a existência de um atleta com nome
    //nome em vec. Devolve o índice da primeira ocorrência de um atleta com o nome dado, ou -1
    //caso não ocorra.
    }
    public static int indiceAtletaPorNomeArrayOrdenado(Atleta[] vec, String nome){
    }
    public static int indiceAtletaPorNomeArrayOrdenado(Atleta[] vec, String nome){
    //Não assume nada sobre a existência de um atleta com nome nome em vec. Assume que vec
    //está ordenado por ordem crescente do nome do atleta. Devolve o índice único onde ocorre o
    //atleta com o nome dado, caso só ocorra 1 vez; devolve um índice qualquer onde ocorra um
    //atleta com o nome dado, caso haja mais de 1 ocorrência; devolve -1 caso não ocorra.
    }
    public static Atleta[] seleccionaEscalaoEouNacionalidade(Atleta[] vec, String escalao, String nacionalidade){
    //Devolve um novo array que contém todos os atletas de vec obedecendo a 0, 1 ou 2 restrições:
    //se escalao = “todos” e nacionalidade = “todas” (0 restrições), são copiados todos os atletas de vec;
    //se nacionalidade = “todas” e escalao ≠ “todos” (1 restrição), são copiados todos os atletas cujo escalão é igual ao escalao dado;
    // se escalao = “todos” e nacionalidade ≠ “todas” (1 restrição), são copiados todos os atletas cuja nacionalidade é igual à nacionalidade dada;
    // se escalao ≠ “todos” e nacionalidade ≠ “todas” (2 restrições), são copiados todos os atletas cujo escalão é igual ao escalao dado e cuja nacionalidade é igual à nacionalidade dada.
    }


}
