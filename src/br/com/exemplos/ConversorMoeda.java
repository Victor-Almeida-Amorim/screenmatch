package br.com.exemplos;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public float converterDolarParaReal(float dolar){
        return (float) (dolar*5.90);
    }
}
