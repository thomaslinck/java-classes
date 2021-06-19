package questao4;

public class Categoria1 extends IPVA{

    public Categoria1(){ //testing purposes
        this.rate =  0.03;
    }

    @Override
    public double calculaImposto() {
        return valor * 0.03;
    }
}
