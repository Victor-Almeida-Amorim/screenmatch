package br.com.screenmatch.main;

import br.com.screenmatch.models.Titulo;
import br.com.screenmatch.models.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAPI {

    public static void main(String[] args) throws IOException, InterruptedException {
        String filme = "";
        Scanner s = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!filme.equalsIgnoreCase("sair")) {
            try {
                filme = s.nextLine();
                if(filme.equalsIgnoreCase("sair")){
                    break;
                }

                String http = String.format("http://www.omdbapi.com/?t=%s&apikey=27bfc0be", filme);

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(http))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);

                Titulo titulo = new Titulo(tituloOmdb);

                titulos.add(titulo);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();



    }
}
