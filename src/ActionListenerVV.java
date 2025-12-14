import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionListenerVV implements ActionListener {
    String choice;

    public ActionListenerVV(String choice) {
        this.choice = choice;
    }

    public void actionPerformed(ActionEvent clicked) {
        ScreenContainer.getNextScreen(choice);
    }
}