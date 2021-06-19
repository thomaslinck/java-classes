package questao4;

public class Categoria2 extends IPVA{

    public Categoria2(){ //testing purposes
        this.rate =  0.02;
    }

    @Override
    public double calculaImposto() {
        return valor * 0.02;
    }
}