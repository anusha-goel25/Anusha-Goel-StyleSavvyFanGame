import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionListenerVV implements ActionListener {
    String chosen;

    //setting the inputted choice(right or left) to the field chosen so that it can
    //be used in actionPerformed/put in getnextscreen
    public ActionListenerVV(String choice) {
        this.chosen = choice;
    }

    public void actionPerformed(ActionEvent clicked) {
        // the try and catch stuff was just a quick fix thing that VSCODE gave me to make it work 
        try {
            ScreenContainer.getNextScreen(chosen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}