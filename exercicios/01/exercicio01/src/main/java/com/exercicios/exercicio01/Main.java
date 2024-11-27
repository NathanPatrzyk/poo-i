package com.exercicios.exercicio01;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel panelMain;
    private JButton calcularButton;
    private JTextField juroAoMesTextField;
    private JTextField numDeAnosTextField;
    private JTextField depositoMensalTextField;
    private JTextField totalPoupadoTextField;

    public Main() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float juroAoMes = Float.parseFloat(juroAoMesTextField.getText());
                float numDeAnos = Float.parseFloat(numDeAnosTextField.getText());
                float depositoMensal = Float.parseFloat(depositoMensalTextField.getText());

                float totalPoupado = (juroAoMes/100) * numDeAnos * depositoMensal;
                totalPoupadoTextField.setText(Float.toString(totalPoupado));
            }
        });
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();

        Main m = new Main();
        m.setContentPane(m.panelMain);
        m.setTitle("Calculadora Poupança");
        m.setSize(600,400);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
