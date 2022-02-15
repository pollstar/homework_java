package swing_test;

import javax.swing.*;
import java.awt.*;

public class Start extends JPanel {
    private JPanel panelRange = new JPanel();

    //create input fields for set range
    private JTextField maxNumber = new JTextField("10");
    private JTextField minNumber = new JTextField("0");

    public Start() {
        //create panel for range
        minNumber.setPreferredSize(new Dimension(50,25));
        maxNumber.setPreferredSize(new Dimension(50,25));
        setLayout(new BorderLayout());

        //add labels on panel
        panelRange.add(new JLabel("minimal:"));
        panelRange.add(minNumber);

        panelRange.add(new JLabel("maximal:"));
        panelRange.add(maxNumber);
        // set border and title for panel
        panelRange.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),
                "Select range:"));

        //create button dor start
        JButton btnStart  = new JButton("START GAME...");

        add(panelRange, BorderLayout.NORTH);
        add(btnStart, BorderLayout.CENTER);
    }
}
