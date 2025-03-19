package br.com.exemplos;

public class TabuadaMultiplicacao implements  Tabuada {

    @Override
    public void tabuada(int numero){
        for (int i = 0; i <10; i++){
            System.out.println(String.format("""
                    %d x %d = %d""", numero, (i+1), (numero*(i+1))));
        }
    }
}
