package swing_test;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame   {
    private Start startGame= new Start();
    private Game game = new Game(0,10);

    public Main() {
        // добавление и настройка компонент
        Container c = getContentPane(); // клиентская область окна
        c.setLayout(new BorderLayout()); // выбираем компоновщик

//        c.add(startGame);
       c.add(game);

        setTitle("Guess the number...");
        setPreferredSize(new Dimension(240, 180));
        // завершить приложение при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // устанавливаем желательные размеры
        setVisible(true); // отображаем окно
    }

    public static void main(String[] args) {
        new Main();
    }
}
