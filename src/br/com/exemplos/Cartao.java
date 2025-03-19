package br.com.exemplos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Cartao {
    private float limite;
    private float totalCompra;
    private ArrayList<Compra> compras;

    public Cartao(float limite){
        this.limite = limite;
        this.totalCompra = 0;
        this.compras = new ArrayList<>();

    }

    public ArrayList<Compra> getCompras(){
        return this.compras;
    }

    public boolean compra(String item, float valor){
        if (valor<=(limite-totalCompra)) {
            this.totalCompra = this.totalCompra+valor;
            compras.add(new Compra(item, valor));
            return true;
        }
        else {
            System.out.println("Compra Negada!");
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format("""
                Valor total da compra: %f
                %s
                """, this.totalCompra, this.compras.toString());
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        float limite = s.nextFloat();
        Cartao cartao = new Cartao(limite);
        boolean encerrar = true;

        while (encerrar != false){
            System.out.println("""
                    1 - adicionar nova compra
                    2 - encerrar compras
                    """);
            int opcao = s.nextInt();
            s.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Item: ");
                    String item = s.nextLine();
                    System.out.println("Valor: ");
                    float valor = s.nextFloat();
                    boolean aux = cartao.compra(item,valor);
                    if (aux == false){
                        encerrar = false;
                    }
                    break;
                case 2:
                    encerrar = false;
                    break;
            }

        }
        Collections.sort(cartao.getCompras());
        System.out.println(cartao);

    }

}
