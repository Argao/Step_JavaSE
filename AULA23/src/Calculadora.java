import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class Calculadora extends JFrame {
    private JButton n1, n2;
    private JButton somar, igual;
    private JTextField display;

    private char operacao;
    private double leitura, memoria;

    public Calculadora(){
        leitura = 0;
        memoria = 0;

        //sobre o JFRAME
        this.setTitle("Calculadora Swing");
        this.setBounds(0,0,300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        //--------------------------------------------

        //Botão de Números----------------------------
        n1 = new JButton();
        n1.setText("1");
        n1.setBounds(25,70,45,45);
        this.add(n1);

        n2 = new JButton();
        n2.setText("2");
        n2.setBounds(95,70,45,45);
        this.add(n2);

        //Botões de operação-------------------------
        somar = new JButton();
        somar.setText("+");
        somar.setBounds(25,140,45,45);
        this.add(somar);

        igual = new JButton();
        igual.setText("=");
        igual.setBounds(95,140,45,45);
        this.add(igual);

        //DISPLAY----------------------------------
        display = new JTextField();
        display.setBounds(25,25,200,30);
        this.add(display);

        //EVENTOS---------------------------------
        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;//jogar valores uma casa à esquerda
                leitura += 1;//adicionar o valor clicado
                display.setText(display.getText()+1);
            }
        });

        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;//jogar valores uma casa à esquerda
                leitura += 2;//adicionar o valor clicado
                display.setText(display.getText()+2);
            }
        });

        somar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                display.setText("");
            }
        });

        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operacao){
                    case '+':
                        memoria += leitura;
                        break;
                }
                leitura = 0;
                display.setText(Double.toString(memoria));
            }
        });
    }
}
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JButton n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
    private JButton somar, igual,diminuir,virguala,multiplicacao,divisao,raiz,limpar;
    private JTextField display;

    private char operacao;
    private double leitura, memoria;


    public Calculadora(){
        leitura = 0;
        memoria = 0;

        this.setTitle("Calculadora Swing");
        this.setBounds(0,0,275,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        //----------------------------------------

        //Botão de Números
        n0 = new JButton();
        n0.setText("0");
        n0.setBounds(25,300,45,45);
        this.add(n0);

        n1 = new JButton();
        n1.setText("1");
        n1.setBounds(25,245,45,45);
        this.add(n1);

        n2 = new JButton();
        n2.setText("2");
        n2.setBounds(80,245,45,45);
        this.add(n2);

        n3 = new JButton();
        n3.setText("3");
        n3.setBounds(135,245,45,45);
        this.add(n3);

        n4 = new JButton();
        n4.setText("4");
        n4.setBounds(25,190,45,45);
        this.add(n4);

        n5 = new JButton();
        n5.setText("5");
        n5.setBounds(80,190,45,45);
        this.add(n5);

        n6 = new JButton();
        n6.setText("6");
        n6.setBounds(135,190,45,45);
        this.add(n6);

        n7 = new JButton();
        n7.setText("7");
        n7.setBounds(25,135,45,45);
        this.add(n7);

        n8 = new JButton();
        n8.setText("8");
        n8.setBounds(80,135,45,45);
        this.add(n8);

        n9 = new JButton();
        n9.setText("9");
        n9.setBounds(135,135,45,45);
        this.add(n9);


        //Botoes de operação

        somar = new JButton();
        somar.setText("+");
        somar.setBounds(190,300,45,45);
        this.add(somar);

        igual = new JButton();
        igual.setText("=");
        igual.setBounds(135,300,45,45);
        this.add(igual);

        diminuir = new JButton();
        diminuir.setText("-");
        diminuir.setBounds(190,245,45,45);
        this.add(diminuir);

        virguala = new JButton();
        virguala.setText(",");
        virguala.setBounds(80,300,45,45);
        this.add(virguala);

        multiplicacao = new JButton();
        multiplicacao.setText("x");
        multiplicacao.setBounds(190,190,45,45);
        this.add(multiplicacao);

        divisao = new JButton();
        divisao.setText("÷");
        divisao.setBounds(190,135,45,45);
        this.add(divisao);

        raiz = new JButton();
        raiz.setText("√");
        raiz.setBounds(190,80,45,45);
        this.add(raiz);

        limpar = new JButton();
        limpar.setText("C");
        limpar.setBounds(25,80,155,45);
        this.add(limpar);




        //Display
        display = new JTextField();
        display.setBounds(25,25,210,45);
        this.add(display);

        //Eventos
        n0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                display.setText(display.getText()+0);
            }
        });
        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 1;
                display.setText(display.getText()+1);
            }
        });
        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 2;
                display.setText(display.getText()+2);
            }
        });
        n3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 3;
                display.setText(display.getText()+3);
            }
        });
        n4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 4;
                display.setText(display.getText()+4);
            }
        });
        n5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 5;
                display.setText(display.getText()+5);
            }
        });
        n6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 6;
                display.setText(display.getText()+6);
            }
        });
        n7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 7;
                display.setText(display.getText()+7);
            }
        });

        n8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 8;
                display.setText(display.getText()+8);
            }
        });
        n9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leitura *= 10;
                leitura += 9;
                display.setText(display.getText()+9);
            }
        });

        virguala.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memoria = 0;
                leitura = 0;
                display.setText("");
            }
        });

        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memoria = 0;
                leitura = 0;
                display.setText("");
            }
        });


        somar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria +  " + ");
            }
        });
        diminuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '-';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria +  " - ");
            }
        });
        multiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = 'x';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria +  " x ");
            }
        });
        divisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '÷';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " ÷ ");
            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memoria += leitura;
                memoria  = Math.sqrt(memoria);
                leitura = 0;
                display.setText(Double.toString(memoria));
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operacao){
                    case '+':
                        memoria += leitura;
                        break;
                    case '-':
                        memoria -= leitura;
                        break;
                    case 'x':
                        memoria *= leitura;
                        break;
                    case '÷':
                        memoria /= leitura;
                        break;
                }
                leitura = 0;
                display.setText(Double.toString(memoria));
            }
        });

    }
}
