package br.com.exemplos;

public class ConversorPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(float celcius){
        return (celcius*1.8+32);
    }

    @Override
    public double fahrenheitParaCelsius(float fahrenheit) {
        return (fahrenheit/1.8-32);
    }
}
