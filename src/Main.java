import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto         Contrutor
        Turista mochileiro = new Turista("Maia");
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf(Validacao.cpf("123"));
        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");
        // Atribuição indireta
        String nome = JOptionPane.showInputDialog("Entre com o nome");
        mochileira.setNome(nome);
        System.out.println("O nome do objeto é :" + mochileira.getNome());
        // Fazer o mesmo para capturar o cpf deste objeto
        String cpf = JOptionPane.showInputDialog("Entre com o cpf");
        mochileira.setCpf(cpf);
        System.out.println("O CPF do objeto é :" + mochileira.getCpf());
        // Novo objeto
        nome = JOptionPane.showInputDialog("Qual seu nome: ");
        // Criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista(nome);
        System.out.println("O nome deste turista é :" + outroTurista.getNome());
        // Fazer o recebimento  do cpf para este turista

    }
}