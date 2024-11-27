package com.exercicios;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
       private JPanel panelMain;
    private JTextField numerosTextField;
    private JButton identificarButton;
    private JTextField maiorTextField;
    private JTextField menorTextField;
    private JTextField mediaTextField;

    public Main() {
        identificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] numerosText = numerosTextField.getText().strip().split(",");

                float maior = Float.parseFloat(numerosText[0]);
                float menor = Float.parseFloat(numerosText[0]);
                float somatoria = 0;
                float quantidade = numerosText.length;

                for (String numeroText : numerosText) {
                    somatoria += Float.parseFloat(numeroText);

                    if (Float.parseFloat(numeroText) > maior) {
                        maior = Float.parseFloat(numeroText);
                    }

                    if (Float.parseFloat(numeroText) < menor) {
                        menor = Float.parseFloat(numeroText);
                    }
                }

                float media = somatoria/quantidade;

                maiorTextField.setText(Float.toString(maior));
                menorTextField.setText(Float.toString(menor));;
                mediaTextField.setText(Float.toString(media));;
            }
        });
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();

        Main m = new Main();
        m.setContentPane(m.panelMain);
        m.setTitle("Lista de Números");
        m.setSize(500,400);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
