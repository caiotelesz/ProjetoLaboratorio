import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Fila<String> pessoa= new Fila<>();

        int resp = 0;

        int posicaoPacientePrioritario = 0, posicaoPacienteNormal = 0;
        Pessoa pessoa1 = new Pessoa();

        do {
            String[] valores = {"Retirar Senha", "Chamar paciente", "Verificar fila", "Verificar Início da Fila", "Sair"};
            Object opcao = JOptionPane.showInputDialog(null, "O que deseja fazer?", "Laboratório", JOptionPane.WARNING_MESSAGE, null, valores, valores[0]);

            if (opcao.equals("Retirar Senha")) {
                String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
                String[] situacao = {"Paciente Normal", "Paciente Prioritário"};
                opcao = JOptionPane.showOptionDialog(null, "Situação do paciente", "Senha", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, situacao, situacao[1]);

                if(pessoa.estaVazia()) {
                    posicaoPacientePrioritario = 0;
                    posicaoPacienteNormal = 0;
                } if(opcao.equals(1)) {
                    pessoa.enfileira(posicaoPacienteNormal, nome, true);
                    posicaoPacientePrioritario++;
                } else if(opcao.equals(0)) {
                    pessoa.enfileira(posicaoPacienteNormal, nome, false);
                    posicaoPacienteNormal++;
                }


                JOptionPane.showMessageDialog(null, "Paciente adicionado!");

            } else if (opcao.equals("Chamar paciente")) {
                if(!(pessoa.estaVazia())) {
                    String proximoPaciente = pessoa.espiar();
                    JOptionPane.showMessageDialog(null, "Próximo paciente: " + proximoPaciente);

                    if(pessoa1.isPrioridade() == true) {
                        pessoa.desenfileira(true);
                    } else if (pessoa1.isPrioridade() == false) {
                        pessoa.desenfileira(false);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Não há ninguém na fila");
                }

            } else if (opcao.equals("Verificar fila")) {
                if (!pessoa.estaVazia()) {
                    String mensagem;
                    if(pessoa.tamanho == 1) {
                        mensagem = "Tamanho da fila: " + pessoa.tamanho() + " pessoa";
                    } else {
                        mensagem = "Tamanho da fila: " + pessoa.tamanho() + " pessoas";
                    }
                    JOptionPane.showMessageDialog(null, mensagem);
                } else {
                    JOptionPane.showMessageDialog(null, "Não há ninguém na fila");
                }
            } else if (opcao.equals("Verificar Início da Fila")) {
                if(!(pessoa.estaVazia())) {
                    String primeiroPaciente = pessoa.espiar();
                    JOptionPane.showMessageDialog(null, "Primeiro paciente: " + primeiroPaciente);
                } else {
                    JOptionPane.showMessageDialog(null, "Não há ninguém na fila");
                }
            } else if (opcao.equals("Sair")) {
                resp = 1;
            }
        } while(resp == 0);


    }
}
