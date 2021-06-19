package questao4;

public abstract class IPVA {
    String nome;
    String place;
    double valor;
    int ano;

    protected double rate; //testing purposes

    public abstract double calculaImposto();

    public IPVA(){}

    public double getRate() { //testing purposes
        return rate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
