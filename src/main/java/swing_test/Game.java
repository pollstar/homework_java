package swing_test;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class Game extends JPanel{
    private int min;
    private int max;

    private JTextField answer = new JTextField("enter here you number");
    private JLabel result = new JLabel("");


    public boolean setMin(int min) {
        if (this.max > min) {
            this.min = min;
            return true;
        }
        return false;
    }

    public boolean setMax(int max) {
        if (this.min < max) {
            this.max = max;
            return true;
        }
        return false;
    }

    public Game(int min, int max) {
        setMax(max);
        setMin(min);

//        setLayout(new BorderLayout());

        //add labels on panel
        JLabel label1 = new JLabel("Your number?");
        label1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        add(label1, BorderLayout.NORTH);

        this.answer.setBorder(new BasicBorders.FieldBorder(Color.blue, Color.BLACK, Color.GRAY, Color.blue));
        this.answer.setFont(new Font(Font.DIALOG_INPUT, Font.ITALIC, 15));
        this.answer.setSize(new Dimension(30,40));
        add(answer, BorderLayout.CENTER);

        add(result, BorderLayout.SOUTH);
    }
}
