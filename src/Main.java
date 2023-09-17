import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Fila<String> pessoa= new Fila<>();

        int resp = 0;

        do {
            String[] valores = {"Retirar Senha", "Chamar paciente", "Verificar fila", "Verificar Início da Fila", "Sair"};
            Object opcao = JOptionPane.showInputDialog(null, "O que deseja fazer?", "Laboratório", JOptionPane.WARNING_MESSAGE, null, valores, valores[0]);

            if (opcao.equals("Retirar Senha")) {
                String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
                String[] situacao = {"Paciente Normal", "Paciente Prioritário"};
                opcao = JOptionPane.showOptionDialog(null, "Situação do paciente", "Senha", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, situacao, situacao[1]);

                if(opcao.equals(0)) {
                    pessoa.enfileira(nome, false);
                } else if(opcao.equals(1)) {
                    pessoa.enfileira(nome, true);
                }




            } else if (opcao.equals("Chamar paciente")) {

            } else if (opcao.equals("Verificar fila")) {

            } else if (opcao.equals("Verificar Início da fila")) {

            } else if (opcao.equals("Sair")) {
                resp = 1;
            }
        } while(resp == 0);


    }
}
