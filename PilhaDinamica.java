public class PilhaDinamica {
    private No topo;
    private int tamanho;

    public PilhaDinamica(){
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean estaVazia(){
        return topo == null;
    }

    public int tamanho(){
        return tamanho;
    }

    public void empilhar(String valor){
        No novo = new No(valor);
        novo.setProx(topo);
        topo = novo;
        tamanho++;
    }

    public String desempilhar(){
        if (estaVazia()){
            throw new RuntimeException("a pilha está vazia");
        }
        String valor = topo.getConteudo();
        topo = topo.getProx();
        tamanho--;
        return valor;
    }

    public String topo(){
        if (estaVazia()){
            throw new RuntimeException("a pilha está vazia");
        }
        return topo.getConteudo();
    }
}