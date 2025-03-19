package br.com.screenmatch.main;

import br.com.screenmatch.models.Filme;
import br.com.screenmatch.models.Serie;
import br.com.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainListas {

    public static void main(String[] args){
        ArrayList<Titulo> lista = new ArrayList<>();

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Serie lost = new Serie("Lost", 2000);

        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }

}
