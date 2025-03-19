package br.com.minhasMusicas.modelo;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getAvaliacao(){
        if (super.getTotalCurtidas()>2000){
            return 10;
        }
        else if (super.getAvaliacao()>1800){
            return 8;
        }
        else{
            return 6;
        }
    }
}
