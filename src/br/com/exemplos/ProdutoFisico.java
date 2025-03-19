package br.com.exemplos;

public class ProdutoFisico implements Calculavel{

    @Override
    public float calcularPrecoFinal(int quantidade, float preco) {
        return quantidade*preco;
    }
}
