package br.com.exemplos;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double calcularArea(float area, float largura){
        return area*largura;
    }

    @Override
    public float calcularPerimetro(float altura, float largura) {
        return altura*2+largura*2;
    }
}
