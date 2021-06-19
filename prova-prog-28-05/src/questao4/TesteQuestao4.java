package questao4;

import java.util.ArrayList;
import java.util.Random;

public class TesteQuestao4 {
    public void test() {
        ArrayList<IPVA> objects = createObjects();
        objects.forEach(this::testCalculoImposto);
    }

    private ArrayList<IPVA> createObjects(){
        ArrayList<IPVA> objects = new ArrayList<>();

        objects.add(new Categoria1());
        objects.add(new Categoria2());
        objects.add(new Categoria3());

        return objects;
    }

    private void testCalculoImposto(IPVA object){
        Boolean success = true;

        object.setValor(new Random().nextDouble()*100000);

        if(object.calculaImposto() != object.getValor() * object.getRate())
            success = false;

        System.out.println(success ? "Sucesso" : "Fail");

    }
}
