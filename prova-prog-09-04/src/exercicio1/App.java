package exercicio1;

public class App {
    public void execute(){
        var socio = new Socio(2000);
        var socioTorcedor = new SocioTorcedor(2001, 1);
        var socioEstudante = new SocioEstudante(2002, "Feevale");

        socio.setAnoIngresso(2003);
        System.out.println("Ano de ingresso do sócio regular:" + socio.getAnoIngresso());

        System.out.println("Ano de ingresso do sócio torcedor:" + socioTorcedor.getAnoIngresso());
        System.out.println("Ano de ingresso do sócio estudante:" + socioEstudante.getAnoIngresso());

        System.out.println("Entre o sócio torcedor e o sócio estudante:");
        var texto = socioTorcedor.outroSocioIngressouAntes(socioEstudante) ? "O sócio estudante é mais velho" : "O sócio torcedor é mais velho";
        System.out.println(texto);

        System.out.println("Cadeira do sócio torcedor:" + socioTorcedor.getCadeira());
        System.out.println("Faculdade do sócio estudante:" + socioEstudante.getInstituicaoEnsino());
    }
}
