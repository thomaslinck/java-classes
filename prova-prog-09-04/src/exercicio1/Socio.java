package exercicio1;

public class Socio {
    private String numeroAssociado;
    private int anoIngresso;

    public Socio(){};
    public Socio(int anoIngresso){ this.anoIngresso = anoIngresso; }
    public Socio(String numeroAssociado, int anoIngresso){
        this.anoIngresso = anoIngresso;
        this.numeroAssociado = numeroAssociado;
    }

    public String getNumeroAssociado() { return numeroAssociado; }
    public void setNumeroAssociado(String numeroAssociado) { this.numeroAssociado = numeroAssociado; }

    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public boolean equals(Socio socio){ return socio.getAnoIngresso() == this.anoIngresso; }
    public boolean outroSocioIngressouAntes(Socio outroSocio){ return outroSocio.getAnoIngresso() > this.anoIngresso; }

}
