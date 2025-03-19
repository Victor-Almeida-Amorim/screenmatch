package br.com.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exemplo1 {

    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("EEEEE");
        lista.add("CCCC");
        lista.add("TTTT");
        lista.add("BBBB");
        lista.add("AAAA");

        for(String item: lista){
            System.out.println(item);
        }

        Collections.sort(lista);

        for(String item: lista){
            System.out.println(item);
        }


    }
}