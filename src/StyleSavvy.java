import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;

public class StyleSavvy extends JFrame {
    public StyleSavvy() {
        super("Style Savvy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font buttonFont = new Font("Serif", Font.PLAIN, 30);

        // setting up the common features of all the panels
        for (int i = 0; i < ScreenContainer.allPanels.length; i++) {
            ScreenContainer.allPanels[i].setLayout(null);
            ScreenContainer.allPanels[i].setPreferredSize(new Dimension(1300, 800));
            ScreenContainer.allPanels[i].setBackground(new Color(255, 217, 231));

            JButton leftButton = Options.Button1Maker();
            JButton rightButton = Options.Button2Maker();

            leftButton.setBounds(150, 500, 400, 200);
            rightButton.setBounds(750, 500, 400, 200);

            leftButton.setFont(buttonFont);
            rightButton.setFont(buttonFont);

            if (ScreenContainer.allPanels[i] == ScreenContainer.screenOriginal) {
                leftButton.setText("Cute!");
                rightButton.setText("Alt!");
                JLabel pika = new JLabel((new ImageIcon("resources/pikachu.png")));
                pika.setBounds(20, 300, 100, 100);
                ScreenContainer.screenOriginal.add(pika);
                JLabel label = new JLabel((new ImageIcon("resources/test.png")));
                label.setBounds(50, 300, 100, 100);
                ScreenContainer.screenOriginal.add(label);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCute) {
                leftButton.setText("Top!");
                rightButton.setText("Dress!");

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAlt) {
                leftButton.setText("Top!");
                rightButton.setText("Dress!");
            }

            ScreenContainer.allPanels[i].add(leftButton);
            ScreenContainer.allPanels[i].add(rightButton);
        }

        add(ScreenContainer.screenOriginal);
        pack();
        setVisible(true);

    }

    //using swing you actually need to use functions to remove the previous panels to add another one
    public void setScreen(JPanel panel) {
        getContentPane().removeAll();
        add(panel);
        revalidate();
        repaint();
    }
}
