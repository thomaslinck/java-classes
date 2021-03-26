package atividadeEstudoHeranca.programador;

import atividadeEstudoHeranca.funcionario.Funcionario;

public class Programador extends Funcionario {
    private String linguagemProgramacaoPreferida;

    public Programador(String nome, String codigo, String linguagemProgramacaoPreferida) {
        super(nome, codigo);
        this.linguagemProgramacaoPreferida = linguagemProgramacaoPreferida;
    }

    public Programador(String nome, String codigo) {
        super(nome, codigo);
    }

    public Programador() {
        super();
    }

    public Programador(String linguagemProgramacaoPreferida) {
        this.linguagemProgramacaoPreferida = linguagemProgramacaoPreferida;
    }

    public String getLinguagemProgramacaoPreferida() {
        return linguagemProgramacaoPreferida;
    }

    public void setLinguagemProgramacaoPreferida(String linguagemProgramacaoPreferida) {
        this.linguagemProgramacaoPreferida = linguagemProgramacaoPreferida;
    }
}
