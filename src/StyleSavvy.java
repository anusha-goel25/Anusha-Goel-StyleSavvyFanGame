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
        // title window
        super("Style Savvy");
        makeOpeningPanel();
        // Setting the default close operation (exit when the window is closed)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void makeOpeningPanel() {
        JPanel panel = ScreenContainer.screenOriginal;
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(1300, 800));
        panel.setBackground(new Color(255, 217, 231));

        // making both buttons
        Font buttonFont = new Font("Serif", Font.PLAIN, 30);
        JButton button1 = new JButton("Cute!");
        button1.setBounds(150, 500, 400, 200);
        button1.setFont(buttonFont);
        button1.addActionListener(new ActionListenerVV(Options.cute));
        panel.add(button1);

        JButton button2 = new JButton("Alternative!");
        button2.setBounds(750, 500, 400, 200);
        button2.setFont(buttonFont);
        button2.addActionListener(new ActionListenerVV(Options.alt));
        panel.add(button2);

        // making a label
        JLabel label = new JLabel((new ImageIcon("resources/test.png")));
        label.setBounds(50, 300, 100, 100);
        panel.add(label);

        // adding the panel in
        add(panel);

        // Packing the frame + making it visible
        pack();
        setVisible(true);
    }
}
