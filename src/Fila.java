import javax.swing.*;

public class Fila<T> extends EstruturaEstatica<T>{
    public Fila() {
        super();
    }

    public Fila(int capacidade, int colunas) {
        super(capacidade, colunas);
    }

    public void enfileira(T elemento, boolean prioridade) {
        if (prioridade == true) {
            this.adiciona(0, 0, elemento); // Adiciona no início da fila
        } else if(prioridade == false) {
            this.adiciona(0, 1, elemento);
        } else if(this.estaVazia()) {
            JOptionPane.showMessageDialog(null, "Não há ninguém na fila");
        }
    }
    public T espiar() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[0][0];
    }

    public T desenfileira() {
        if (this.estaVazia()) {
            return null;
        }

        // Verifica se há elemento prioritário no início da fila
        if (this.elementos[0][0] != null) {
            return this.remove(0, 0); // Remove o elemento prioritário
        } else {
            return this.remove(0, 1); // Remove o elemento normal
        }
    }
}
