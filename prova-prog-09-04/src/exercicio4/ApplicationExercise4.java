package exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationExercise4 {
    List<Conta> contas = new ArrayList<>();

    public void execute(){
        criarConta();
        contas.stream().forEach(this::imprimeInformacoesConta);
    };

    private void criarConta(){
        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome do proprietário da conta");
        var conta = new Conta(scanner.nextLine());

        System.out.println("Digite seu filme favorito");
        conta.setFilmeFavorito(new Filme(scanner.nextLine()));

        contas.add(conta);
    }

    private void imprimeInformacoesConta(Conta conta){
        System.out.println("A conta de id " + conta.getId() + " no nome de " + conta.getNomeUsuario() + " tem o filme favorito " + conta.getNomeDoFilmeFavorito());
    }
}
