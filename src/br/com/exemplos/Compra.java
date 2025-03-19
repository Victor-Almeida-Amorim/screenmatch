package br.com.exemplos;

public class Compra implements Comparable<Compra> {
    private String item;
    private float valor;

    public Compra (String item, float valor){
        this.item = item;
        this.valor = valor;
    }

    @Override
    public int compareTo(Compra compra) {
        if (this.valor>compra.valor) {
            return 1;
        }
        else if (this.valor<compra.valor) {
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return String.format("""
                Item: %s, Valor: %f
                """,this.item, this.valor);
    }
}
