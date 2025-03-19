package br.com.exemplos;

import java.util.ArrayList;
import java.util.List;

public class Quadrado implements Forma{

    @Override
    public double calcularArea() {
        double lado = 24;
        return lado*lado;
    }

    public static void main (String[] args){
        List<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado());
        formas.add(new Circulo());

        for(Forma i: formas){
            System.out.println(i.calcularArea());
        }
    }
}
