package exercicio4;

import java.util.UUID;

public class Conta {
    private final UUID id;

    private String nomeUsuario;
    private Filme filmeFavorito;

    public Conta(String nomeUsuario){
        id = UUID.randomUUID();
        this.nomeUsuario = nomeUsuario;
    }

    public UUID getId() { return id; }

    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public String getNomeDoFilmeFavorito(){return filmeFavorito.getNomeDoFilme(); }
    public void setFilmeFavorito(Filme filmeFavorito) { this.filmeFavorito = filmeFavorito; }
}
