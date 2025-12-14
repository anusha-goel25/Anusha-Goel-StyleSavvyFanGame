import javax.swing.JButton;

public class Options {

    /* 
    these methods allow me to make new instances of the same "type" of button(either left or right)
    this works since I put making each panel into a loop and I run the method for each so it's giving each panel its own buttons
    I can't just re-use the same buttons because java-swing doesn't really like that and it just gets wonky
    I found this out two ways:
       1. My dad was looking at my code because I was confused and he said that he had a feeling that it could be a probelem
       2. I looked at this forum: https://stackoverflow.com/questions/19697996/adding-the-same-components-to-multiple-panels 
       the person's problem was a little different but they were also talking about instances so that made me think of methods
    */
    public static JButton Button1Maker() {
        JButton left = new JButton();
        left.addActionListener(new ActionListenerVV("button1"));
        return left;
    }

    public static JButton Button2Maker() {
        JButton right = new JButton();
        right.addActionListener(new ActionListenerVV("button2"));
        return right;
    }
}

    