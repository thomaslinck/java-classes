package exercicio1;

public class SocioEstudante extends Socio{

    private String instituicaoEnsino;

    public SocioEstudante(String instituicaoEnsino) {
        super();
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public SocioEstudante(String numeroAssociado, int anoIngresso, String instituicaoEnsino) {
        super(numeroAssociado, anoIngresso);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public SocioEstudante(int anoIngresso, String instituicaoEnsino) {
        super(anoIngresso);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }
    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }


}
