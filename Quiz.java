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
char guess;

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
  }