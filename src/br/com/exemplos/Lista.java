package br.com.exemplos;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Lista {

    public static void main(String[] args){
        List<Integer> inteiros = new ArrayList<>();
        Random randomNumbers = new Random();

        inteiros.add(randomNumbers.nextInt(100));
        inteiros.add(randomNumbers.nextInt(100));
        inteiros.add(randomNumbers.nextInt(100));
        inteiros.add(randomNumbers.nextInt(100));
        inteiros.add(randomNumbers.nextInt(100));
        inteiros.add(randomNumbers.nextInt(100));
        inteiros.add(randomNumbers.nextInt(100));
        inteiros.add(randomNumbers.nextInt(100));

        System.out.println(inteiros);

        Collections.sort(inteiros);

        System.out.println(inteiros);




    }

}
