/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilostaller;

import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author Jeisson Lopez
 */
public class vista extends JFrame implements ActionListener {

    JFrame JFrame;
    JPanel panel1, panel2, panel3, panelselector, panel4;
    JTextArea contandoatras, contandoadelante, numeroimportante, fecha, hora;
    JButton BIniciar, BTerminar;
    Choice Selector;
    h1 h1;
    h2 h2;
    Sonido Sonido;
    Fecha FC;

    vista() {

        CtrolPanel1();
        CtrolPanel2();
        CtrolPanel3();
        CtrolPanel4();
        CtrolJFrame();

    }

    void CtrolPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 1));
        contandoatras = new JTextArea();
        contandoatras.setEditable(false);
        contandoatras.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        contandoatras.setBorder(BorderFactory.createTitledBorder("CUENTA DESDE ATRAS"));
        contandoadelante = new JTextArea();
        contandoadelante.setEditable(false);
        contandoadelante.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        contandoadelante.setBorder(BorderFactory.createTitledBorder("CUENTA DESDE ADELANTE"));

        panel1.add(contandoatras);
        panel1.add(contandoadelante);

    }

    void CtrolPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 1));

        numeroimportante = new JTextArea();
        numeroimportante.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        numeroimportante.setBorder(BorderFactory.createTitledBorder("INGRESA EL NUMERO A CONTAR"));

        panelselector = new JPanel();
        panelselector.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        panelselector.setBorder(BorderFactory.createTitledBorder("INGRESA LA VELOCIDAD DE CONTEO EN SEGUNDOS"));
        Selector = new Choice();
        Selector.setName("SELECCIONE UNA VELOCIDAD");
        Selector.add("1");
        Selector.add("2");
        Selector.add("4");
        Selector.add("6");

        panelselector.add(Selector);
        panel2.add(numeroimportante);
        panel2.add(panelselector);

    }

    void CtrolPanel3() {
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 1));
        BIniciar = new JButton("INICIAR");
        BIniciar.addActionListener(this);
        BTerminar = new JButton("TERMINAR");
        BTerminar.addActionListener(this);

        panel3.add(BIniciar);
        panel3.add(BTerminar);

    }

    void CtrolPanel4() {
        panel4 = new JPanel();
        panel4.setLayout(new GridLayout(1, 1));
        panel4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        fecha = new JTextArea();
        fecha.setBorder(BorderFactory.createTitledBorder("Fecha Actual"));
        fecha.setEditable(false);

        hora = new JTextArea();
        hora.setBorder(BorderFactory.createTitledBorder("Hora Actual"));
        hora.setEditable(false);
        FC = new Fecha(fecha, hora);
        
        panel4.add(fecha);
        panel4.add(hora);

    }

    void CtrolJFrame() {
        JFrame = new JFrame();
        JFrame.setLayout(new GridLayout(4, 1));
        JFrame.setSize(800, 500);
        JFrame.setLocationRelativeTo(this);
        JFrame.add(panel1);
        JFrame.add(panel2);
        JFrame.add(panel3);
        JFrame.add(panel4);
        JFrame.setDefaultCloseOperation(1);
        JFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFrame.setVisible(true);
        FC.start();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == BIniciar) {

            int x = Integer.parseInt(Selector.getSelectedItem());
            h1 = new h1(numeroimportante, "", contandoadelante, x);
            h2 = new h2(numeroimportante, "", contandoatras, x);
            Sonido = new Sonido(contandoadelante, "", numeroimportante, x);
            Sonido.start();
            h1.start();
            h2.start();

        }
        if (ae.getSource() == BTerminar) {
            h1.stop();
            h2.stop();
            numeroimportante.setText("");
            contandoadelante.setText("");
            contandoatras.setText("");

        }
    }

}
