package dio.curso;

import com.formdev.flatlaf.FlatLightLaf;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTela extends JFrame {
    private JComboBox<Integer> comboBox;
    private JLabel resultadoLabel;
//    FlatLightLaf.setup();

    public MainTela() {
        FlatLightLaf.setup(); // Aplica tema moderno
        setTitle("Dias da Semana");
        setSize(350, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new MigLayout("", "[][grow]", "[][]20[]"));

        JLabel instrucao = new JLabel("Escolha um número de 1 a 7:");
        instrucao.setFont(instrucao.getFont().deriveFont(Font.BOLD, 14f));
        comboBox = new JComboBox<>();
        for (int i = 1; i <= 7; i++) {
            comboBox.addItem(i);
        }
        comboBox.setFont(comboBox.getFont().deriveFont(13f));

        JButton botao = new JButton("Ver dia");
        botao.setFont(botao.getFont().deriveFont(Font.BOLD, 13f));
        resultadoLabel = new JLabel("");
        resultadoLabel.setFont(resultadoLabel.getFont().deriveFont(Font.BOLD, 15f));
        resultadoLabel.setForeground(new Color(33, 150, 243));

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = (int) comboBox.getSelectedItem();
                String dia;
                switch (option) {
                    case 1: dia = "Domingo"; break;
                    case 2: dia = "Segunda"; break;
                    case 3: dia = "Terça"; break;
                    case 4: dia = "Quarta"; break;
                    case 5: dia = "Quinta"; break;
                    case 6: dia = "Sexta"; break;
                    case 7: dia = "Sábado"; break;
                    default: dia = "Inválido";
                }
                resultadoLabel.setText(dia);
            }
        });

        add(instrucao, "span, wrap");
        add(new JLabel("Número:"));
        add(comboBox, "growx, wrap");
        add(botao, "span, center, wrap");
        add(resultadoLabel, "span, center");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainTela().setVisible(true);
        });
    }
}
