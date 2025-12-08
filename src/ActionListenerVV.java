import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ActionListenerVV implements ActionListener {
    String choice;

    public ActionListenerVV(JButton button) {
        if (button == Options.cute) {
            choice = "button1";
        }
        else if (button == Options.alt) {
            choice = "button2";
        }
        System.out.println(choice);
    }

    public void actionPerformed(ActionEvent clicked) {
        if (choice == "button1"){
        System.out.println("Button 1 clicked!");
       }
        else if (choice == "button2"){
            System.out.println("Button 2 clicked!");
        }
    }
}

