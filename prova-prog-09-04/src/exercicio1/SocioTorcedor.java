package exercicio1;

public class SocioTorcedor extends Socio{

    private int cadeira;

    public SocioTorcedor(int cadeira) {
        super();
        this.cadeira = cadeira;
    }

    public SocioTorcedor(String numeroAssociado, int anoIngresso, int cadeira) {
        super(numeroAssociado, anoIngresso);
        this.cadeira = cadeira;
    }

    public SocioTorcedor(int anoIngresso, int cadeira) {
        super(anoIngresso);
        this.cadeira = cadeira;
    }

    public int getCadeira() {
        return cadeira;
    }
    public void setCadeira(int cadeira) {
        this.cadeira = cadeira;
    }


}
