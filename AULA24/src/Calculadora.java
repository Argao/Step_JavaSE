import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JButton n1, n2, n3, n4, n5, n6, n7 ,n8, n9, n0 ,nvg;
    private JButton somar, subtrair, multiplicar, dividir, raiz, igual,bkspc,quadrado,fracao;
    private JButton c, ce, inverteSinal, porcento;
    private JTextField display;

    private char operacao;
    private double leitura, memoria;

    public Calculadora(){
        leitura = 0;
        memoria = 0;

        //=============================================JFRAME
        this.setTitle("Calculadora Swing");
        this.setBounds(0,0,500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        //--------------------------------------------
        
        //===========================================Display
        display = new JTextField();
        display.setBounds(25,25,430,30);
        this.add(display);
        //--------------------------------------------
        
        //========================================Botão de Números
        n1 = new JButton();
        n1.setText("1");
        n1.setBounds(25,340,50,50);
        this.add(n1);

        n2 = new JButton();
        n2.setText("2");
        n2.setBounds(95,340,50,50);
        this.add(n2);

        n3 = new JButton();
        n3.setText("3");
        n3.setBounds(165,340,50,50);
        this.add(n3);

        n4 = new JButton();
        n4.setText("4");
        n4.setBounds(25,280,50,50);
        this.add(n4);

        n5 = new JButton();
        n5.setText("5");
        n5.setBounds(95,280,50,50);
        this.add(n5);

        n6 = new JButton();
        n6.setText("6");
        n6.setBounds(165,280,50,50);
        this.add(n6);

        n7 = new JButton();
        n7.setText("7");
        n7.setBounds(25,220,50,50);
        this.add(n7);

        n8 = new JButton();
        n8.setText("8");
        n8.setBounds(95,220,50,50);
        this.add(n8);

        n9 = new JButton();
        n9.setText("9");
        n9.setBounds(165,220,50,50);
        this.add(n9);

        n0 = new JButton();
        n0.setText("0");
        n0.setBounds(95,400,50,50);
        this.add(n0);

        nvg = new JButton();
        nvg.setText(",");
        nvg.setBounds(165,400,50,50);
        this.add(nvg);

        //Botões de operação-------------------------
        somar = new JButton();
        somar.setText("+");
        somar.setBounds(235,340,50,50);
        this.add(somar);

        subtrair = new JButton();
        subtrair.setText("-");
        subtrair.setBounds(235,280,50,50);
        this.add(subtrair);

        multiplicar = new JButton();
        multiplicar.setText("X");
        multiplicar.setBounds(235,220,50,50);
        this.add(multiplicar);

        dividir = new JButton();
        dividir.setText("÷");
        dividir.setBounds(235,160,50,50);
        this.add(dividir);

        quadrado = new JButton();
        quadrado.setText("x²");
        quadrado.setBounds(95,160,50,50);
        this.add(quadrado);

        fracao = new JButton();
        fracao.setText("1/x");
        fracao.setBounds(25,160,50,50);
        this.add(fracao);

        raiz = new JButton();
        raiz.setText("√");
        raiz.setBounds(165,160,50,50);
        this.add(raiz);

        igual = new JButton();
        igual.setText("=");
        igual.setBounds(235,400,50,50);
        this.add(igual);

        bkspc = new JButton();
        bkspc.setText("←");
        bkspc.setBounds(235,100,50,50);
        this.add(bkspc);

        c = new JButton();
        c.setText("C");
        c.setBounds(165,100,50,50);
        this.add(c);

        ce = new JButton();
        ce.setText("CE");
        ce.setBounds(95,100,50,50);
        this.add(ce);

        porcento = new JButton();
        porcento.setText("%");
        porcento.setBounds(25,100,50,50);
        this.add(porcento);

        inverteSinal = new JButton();
        inverteSinal.setText("+-");
        inverteSinal.setBounds(25,400,50,50);
        this.add(inverteSinal);

        //EVENTOS---------------------------------
        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+1);
            }
        });

        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+2);
            }
        });
        
        n3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+3);
            }
        });

        n4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+4);
            }
        });

        n5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+5);
            }
        });

        n6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+6);
            }
        });

        n7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+7);
            }
        });

        n8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+8);
            }
        });

        n9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+9);
            }
        });

        n0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+0);
            }
        });

        nvg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().indexOf(",")<0 && display.getText().indexOf(".")<0)
                    display.setText(display.getText()+",");
            }
        });

        bkspc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText().substring(0,display.getText().length()-1));
                leitura = getDouble(display.getText());
            }
        });
    //==================================================EVENTOS OPERADORES
        somar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '+';
                memoria += getDouble(display.getText());
                display.setText("");
            }
        });

        subtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '-';
                memoria += getDouble(display.getText());
                display.setText("");
            }
        });

        multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '*';
                memoria += getDouble(display.getText());
                display.setText("");
            }
        });

        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = '/';
                memoria += getDouble(display.getText());
                display.setText("");
            }
        });

        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = Math.sqrt(getDouble(display.getText()));
                display.setText(Double.toString(total));
                memoria = 0;
                display.setText(display.getText().replace(".",","));

            }
        });

        quadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = Math.pow(getDouble(display.getText()),2) ;
                display.setText(Double.toString(total));
                memoria = 0;
                display.setText(display.getText().replace(".",","));

            }
        });

        fracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 1 /getDouble(display.getText());
                display.setText(Double.toString(total));
                memoria = 0;
                display.setText(display.getText().replace(".",","));

            }
        });

        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                memoria = 0;
            }
        });

        ce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });

        porcento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total =(getDouble(display.getText())*memoria)/100;
                display.setText(Double.toString(total));
                memoria = 0;
                display.setText(display.getText().replace(".",","));

            }
        });

        inverteSinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total =getDouble(display.getText())*-1;
                display.setText(Double.toString(total));
                memoria = 0;
                display.setText(display.getText().replace(".",","));

            }
        });

        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operacao){
                    case '+':
                        memoria += getDouble(display.getText());
                        break;

                    case '-':
                        memoria -= getDouble(display.getText());
                        break;

                    case '*':
                        memoria *= getDouble(display.getText());
                        break;

                    case '/':
                        if(getDouble(display.getText()) != 0)
                            memoria /= getDouble(display.getText());
                        break;
                }
                display.setText(Double.toString(memoria));
                display.setText(display.getText().replace(".",","));
                memoria = 0;
            }
        });
    }
    private static double getDouble(String valor){
        valor = valor.replace(",",".");
        
        return Double.parseDouble(valor);
    }
    
}
