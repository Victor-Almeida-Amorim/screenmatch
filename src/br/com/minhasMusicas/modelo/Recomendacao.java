package br.com.minhasMusicas.modelo;

public class Recomendacao {

    public void recomenda(Audio audio){
        if (audio.getAvaliacao()>=9){
            System.out.println(String.format("%s é um sucesso absoluto!", audio.getNome()));
        }
        else if(audio.getAvaliacao()>=7){
            System.out.println(String.format("%s é uma das favoritas do momento!", audio.getNome()));
        }
        else{
            System.out.println(String.format("%s é uma das preferidas dos ouvintes",audio.getNome()));
        }
    }
}
