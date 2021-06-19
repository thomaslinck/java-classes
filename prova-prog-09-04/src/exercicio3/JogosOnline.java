package exercicio3;

public class JogosOnline {
    public void execute(){
        var jogo = new Jogo();

        jogo.setNomeDoJogo("The Witcher");
        jogo.setPlataforma("PS4");
        jogo.setAnoLancamento(2010);

        System.out.println("O jogo " + jogo.getNomeDoJogo() + " para " + jogo.getPlataforma() + " lançado em " + jogo.getAnoLancamento() + " foi corretamente adicionado ");

        try{
            jogo.setPlataforma("Errada");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            jogo.setAnoLancamento(2050);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
