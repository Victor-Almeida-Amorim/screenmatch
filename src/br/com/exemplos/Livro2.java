package br.com.exemplos;

public class Livro2 extends ProdutoFisico{

    @Override
    public float calcularPrecoFinal(int quantidade, float preco) {
        return (float) (quantidade*preco*(0.90));
    }
}
