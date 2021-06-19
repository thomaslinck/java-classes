package questao2;

public class Carro implements  Colorido{
    private String cor;
    private String modelo;

    public void Carro(){}

    public void Carro(String modelo){
        setModelo(modelo);
    }

    public void Carro(String modelo, String cor){
        setCor(cor);
        setModelo(modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }
}
