import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

//métodos
//array

public class Quiz implements ActionListener{
String[] perguntas= {
    "Pergunta 1",
    "Pergunta 2",
    "Pergunta 3"
};
String[][] opcoes = { //primeiro array sao as respostas pra primeira pergunta
    {"resposta 1(1),","resposta 2(1)","resposta 3(1)"},
    {"resposta 1(2),","resposta 2(2)","resposta 3(2)"},
    {"resposta 1(3),","resposta 2(3)","resposta 3(3)"},
};

char[] respostas = {
    'A',
    'B',
    'C'
};
char tentativa;
char resposta;
int index;
int respostas_corretas = 0;
int total_perguntas = perguntas.length; //ajusta de acordo com as perguntas
int resultado;
int tempo=10; // TEMPO PARA RESPONDER

//-------------------------------------------------------------------------- COISAS DA TELA ---------------------------------------------------------------
JFrame frame = new JFrame(); //FRAME DA TELA
JTextField textField = new JTextField(); //MOSTRA A PERGUNTA ATUAL
JTextArea textArea = new JTextArea();
//BOTOES
JButton botaoA = new JButton();
JButton botaoB = new JButton();
JButton botaoC = new JButton();
JButton botaoD = new JButton();
JButton botaoE = new JButton();
JButton botaoF = new JButton(); 
//DISPLAYS
JLabel resposta_labelA = new JLabel();
JLabel resposta_labelB = new JLabel();
JLabel resposta_labelC = new JLabel();
JLabel resposta_labelD = new JLabel();
JLabel resposta_labelE = new JLabel();
JLabel resposta_labelF = new JLabel();
JLabel tempo_Label = new JLabel();
JLabel tempo_restantes = new JLabel();
JTextField numero_esquerda = new JTextField(); //NUMERO DOS PONTOS
JTextField porcentagem = new JTextField(); //PORCENTAGEM DE PONTO


public Quiz() {
            
}
    public void proximaPergunta() {

    }

    public void ActionPerformed(ActionEvent e) {

    }
    public void displayAnswer() {

    }
    public void results() {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
  }

  //VIDEO TEMPO 16:04