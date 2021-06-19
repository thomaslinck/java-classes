package questao4;

public class Categoria3 extends IPVA{

    public Categoria3(){ //testing purposes
        this.rate =  0.01;
    }

    @Override
    public double calculaImposto() {
        return valor * 0.01;
    }
}