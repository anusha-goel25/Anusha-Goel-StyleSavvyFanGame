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

        // setting up all the panels
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
                JLabel opening = new JLabel("Hello! Can you help me choose a new look?");
                opening.setBounds(800,100,300,100);
                ScreenContainer.allPanels[i].add(opening);
                JLabel pic = new JLabel((new ImageIcon("resources/base.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCute) {
                leftButton.setText("Top!");
                rightButton.setText("Dress!");
                JLabel pic = new JLabel((new ImageIcon("resources/base.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);




                } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCute) {
                leftButton.setText("Top!");
                rightButton.setText("Dress!");
                JLabel pic = new JLabel((new ImageIcon("resources/base.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteTop) {
                leftButton.setText("Pants!");
                rightButton.setText("Skirt!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTop.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);
            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteSkirt) {
                leftButton.setText("Hair Accessory!");
                rightButton.setText("Jewelry!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopSkirt.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteSkirtHair) {
                leftButton.setText("Hair Clip!");
                rightButton.setText("Hair Band!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopSkirt.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteSkirtHairclip) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopSkirtClip.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteSkirtHairband) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopSkirtBand.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteSkirtJewelry) {
                leftButton.setText("Earrings!");
                rightButton.setText("Necklace!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopSkirt.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteSkirtEarrings) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopSkirtEarrings.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteSkirtNecklace) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopSkirtNecklace.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCutePants) {
                leftButton.setText("Hair Accessory!");
                rightButton.setText("Jewelry!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopPants.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCutePantsHair) {
                leftButton.setText("Hair Clip!");
                rightButton.setText("Hair Band!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopPants.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCutePantsHairclip) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopPantsClip.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCutePantsHairband) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopPantsBand.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCutePantsJewelry) {
                leftButton.setText("Earrings!");
                rightButton.setText("Necklace!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/cute/CuteTopPants.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCutePantsEarrings) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopPantsEarrings.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCutePantsNecklace) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteTopPantsNecklace.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteDress) {
                leftButton.setText("Hair Accessory!");
                rightButton.setText("Jewelry!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteDress.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteDressHair) {
                leftButton.setText("Hair Clip!");
                rightButton.setText("Hair Band!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteDress.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteDressHairclip) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteDressClip.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteDressHairband) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteDressBand.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteDressJewelry) {
                leftButton.setText("Earrings!");
                rightButton.setText("Necklace!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteDress.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteDressEarrings) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteDressEarrings.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenCuteDressNecklace) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/cute/CuteDressNecklace.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            //alt path
            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAlt) {
                leftButton.setText("Top!");
                rightButton.setText("Dress!");
                JLabel pic = new JLabel((new ImageIcon("resources/base.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltTop) {
                leftButton.setText("Pants!");
                rightButton.setText("Skirt!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/top.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);
            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltSkirt) {
                leftButton.setText("Hair Accessory!");
                rightButton.setText("Jewelry!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/skirt.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltSkirtHair) {
                leftButton.setText("Hair Clip!");
                rightButton.setText("Hair Band!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/skirt.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltSkirtHairclip) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/skirtClip.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltSkirtHairband) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/skirtBand.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltSkirtJewelry) {
                leftButton.setText("Earrings!");
                rightButton.setText("Necklace!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/skirt.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltSkirtEarrings) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/skirtEarrings.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltSkirtNecklace) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/skirtNecklace.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltBottoms) {
                leftButton.setText("Hair Accessory!");
                rightButton.setText("Jewelry!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/jeans.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltPantsHair) {
                leftButton.setText("Hair Clip!");
                rightButton.setText("Hair Band!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/jeans.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltPantsHairclip) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/jeansClip.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltPantsHairband) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/jeansBand.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltPantsJewelry) {
                leftButton.setText("Earrings!");
                rightButton.setText("Necklace!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/jeans.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltPantsEarrings) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/jeansEarrings.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltPantsNecklace) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/jeansNecklace.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltDress) {
                leftButton.setText("Hair Accessory!");
                rightButton.setText("Jewelry!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/dress.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltDressHair) {
                leftButton.setText("Hair Clip!");
                rightButton.setText("Hair Band!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/dress.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltDressHairclip) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/dressClip.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltDressHairband) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/dressBand.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltDressJewelry) {
                leftButton.setText("Earrings!");
                rightButton.setText("Necklace!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/dress.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltDressEarrings) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/dressEarrings.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            } else if (ScreenContainer.allPanels[i] == ScreenContainer.screenAltDressNecklace) {
                leftButton.setText("Nice Job!");
                rightButton.setText("Great Look!");
                JLabel pic = new JLabel((new ImageIcon("resources/alt/dressNecklace.png")));
                pic.setBounds(400, 0, 500, 600);
                ScreenContainer.allPanels[i].add(pic);

            }

            ScreenContainer.allPanels[i].add(leftButton);
            ScreenContainer.allPanels[i].add(rightButton);
        }

    add(ScreenContainer.screenOriginal);
        pack();
        setVisible(true);

    }

    // using swing you actually need to use functions to remove the previous panels
    // to add another one
    // this had an example of someone removing and adding a different panel:
    // https://coderanch.com/t/587351/java/Frame-Panel
    // theirs was more complicated because it was related to another file but the
    // base idea was like identical
    // I just put mine into a method so that I can call it in getNextScreen :)
    public void setScreen(JPanel nextPanel) {
        // the content pane is the current jPanel
        getContentPane().removeAll();
        add(nextPanel);
        revalidate();
        repaint();
    }
}
