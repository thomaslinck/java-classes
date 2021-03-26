package atividadeEstudoHeranca.softwaredeveloper;

import atividadeEstudoHeranca.employee.Employee;

public class SoftwareDeveloper extends Employee {
    private String linguagemProgramacaoPreferida;

    public SoftwareDeveloper(String nome, String codigo, String linguagemProgramacaoPreferida) {
        super(nome, codigo);
        this.linguagemProgramacaoPreferida = linguagemProgramacaoPreferida;
    }

    public SoftwareDeveloper(String nome, String codigo) {
        super(nome, codigo);
    }

    public SoftwareDeveloper() {
        super();
    }

    public SoftwareDeveloper(String linguagemProgramacaoPreferida) {
        this.linguagemProgramacaoPreferida = linguagemProgramacaoPreferida;
    }

    public String getLinguagemProgramacaoPreferida() {
        return linguagemProgramacaoPreferida;
    }

    public void setLinguagemProgramacaoPreferida(String linguagemProgramacaoPreferida) {
        this.linguagemProgramacaoPreferida = linguagemProgramacaoPreferida;
    }
}
