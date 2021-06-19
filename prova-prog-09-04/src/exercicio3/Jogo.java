package exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jogo {
    private final int anoAtual = 2020;
    private final List<String> plataformasPermitidas = new ArrayList<>(Arrays.asList("PS4", "Xbox"));

    private String nomeDoJogo;
    private String plataforma;
    private int anoLancamento;

    public Jogo(){};

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }
    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public String getPlataforma() {
        return plataforma;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setPlataforma(String plataforma){
        if(!plataformasPermitidas.contains(plataforma))
            throw new RuntimeException("Plataforma " + plataforma + " não permitida");
        this.plataforma = plataforma;
    }

    public void setAnoLancamento(int anoLancamento){
        if(anoLancamento > anoAtual)
            throw new RuntimeException("O ano " + anoLancamento + " é maior que o ano atual");
        this.anoLancamento = anoLancamento;
    }

}
