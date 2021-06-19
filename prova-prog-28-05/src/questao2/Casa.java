package questao2;

public class Casa implements  Colorido{
    private String cor;
    private String endereco;

    public void Casa(){}

    public void Casa(String endereco){
        setEndereco(endereco);
    }

    public void Casa(String endereco, String cor){
        setCor(cor);
        setEndereco(endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
