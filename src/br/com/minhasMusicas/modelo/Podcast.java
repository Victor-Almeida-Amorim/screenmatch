package br.com.minhasMusicas.modelo;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getAvaliacao(){
        if (super.getTotalCurtidas()>1500){
            return 10;
        }
        else if (super.getAvaliacao()>800){
            return 8;
        }
        else{
            return 6;
        }
    }
}
