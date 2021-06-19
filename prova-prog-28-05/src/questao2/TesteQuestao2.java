package questao2;

public class TesteQuestao2 {
    public void test(){
        Boolean success = true;

        Carro carro = new Carro();
        Casa casa = new Casa();

        carro.setCor("Azul");
        if(carro.getCor() != "Azul")
            success = false;

        casa.setCor("Amarelo");
        if(casa.getCor() != "Amarelo")
            success = false;

        carro.setModelo("Camaro");
        if(carro.getModelo() != "Camaro")
            success = false;

        casa.setEndereco("Rua");
        if(casa.getEndereco() != "Rua")
            success = false;

        System.out.println(success ? "Sucesso" : "Fail");
    }
}
