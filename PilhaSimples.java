public class PilhaSimples{
    private int topo;
    private int[] elementos;
    private int capacidade;

    public PilhaSimples(int capacidade){
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public boolean estaVazia(){
        return topo == -1;
    }

    public boolean estaCheia(){
        return topo == capacidade - 1;
    }

    public int tamanho(){
        return topo + 1;
    }

    public void empilhar(int valor){
        if (estaCheia()){
            throw new RuntimeException("a pilha está cheia");
        }
        topo++;
        elementos[topo] = valor;
    }

    public int desempilhar(){
        if (estaVazia()){
            throw new RuntimeException("a pilha está vazia");
        }
        return elementos[topo--];
    }

    public int topo(){
        if (estaVazia()){
            throw new RuntimeException("a pilha está vazia");
        }
        return elementos[topo];
    }
}