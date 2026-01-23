import javax.swing.JPanel;

public class ScreenContainer {
    static JPanel screenOriginal = new JPanel();
    static JPanel screenCute = new JPanel();
    static JPanel screenCuteDress = new JPanel();
    static JPanel screenAlt = new JPanel();
    static JPanel screenAltDress = new JPanel();
    static JPanel screenAltTop = new JPanel();
    static JPanel screenCuteTop = new JPanel();
    static JPanel screenAltBottoms = new JPanel();
    static JPanel screenAltSkirt = new JPanel();
    static JPanel screenCutePants = new JPanel();
    static JPanel screenCuteSkirt = new JPanel();
    static JPanel screenCuteHair = new JPanel();
    static JPanel screenCuteHairband = new JPanel();
    static JPanel screenCuteHairclip = new JPanel();
    static JPanel screenCuteJewelry = new JPanel();
    static JPanel screenCuteJewelryEarrings = new JPanel();
    static JPanel screenCuteJewelryNecklace = new JPanel();
    static JPanel screenAltSkirtHair = new JPanel();
    static JPanel screenAltSkirtHairclip = new JPanel();
    static JPanel screenAltSkirtHairband = new JPanel();
    static JPanel screenAltSkirtJewelry = new JPanel();
    static JPanel screenAltSkirtEarrings = new JPanel();
    static JPanel screenAltSkirtNecklace = new JPanel();
    static JPanel screenAltPantsHair = new JPanel();
    static JPanel screenAltPantsHairclip = new JPanel();
    static JPanel screenAltPantsHairband = new JPanel();
    static JPanel screenAltPantsJewelry = new JPanel();
    static JPanel screenAltPantsEarrings = new JPanel();
    static JPanel screenAltPantsNecklace = new JPanel();
    static JPanel screenAltDressHair = new JPanel();
    static JPanel screenAltDressHairclip = new JPanel();
    static JPanel screenAltDressHairband = new JPanel();
    static JPanel screenAltDressJewelry = new JPanel();
    static JPanel screenAltDressEarrings = new JPanel();
    static JPanel screenAltDressNecklace = new JPanel();
    static JPanel screenCuteSkirtHair = new JPanel();
    static JPanel screenCuteSkirtHairclip = new JPanel();
    static JPanel screenCuteSkirtHairband = new JPanel();
    static JPanel screenCuteSkirtJewelry = new JPanel();
    static JPanel screenCuteSkirtEarrings = new JPanel();
    static JPanel screenCuteSkirtNecklace = new JPanel();
    static JPanel screenCutePantsHair = new JPanel();
    static JPanel screenCutePantsHairclip = new JPanel();
    static JPanel screenCutePantsHairband = new JPanel();
    static JPanel screenCutePantsJewelry = new JPanel();
    static JPanel screenCutePantsEarrings = new JPanel();
    static JPanel screenCutePantsNecklace = new JPanel();
    static JPanel screenCuteDressHair = new JPanel();
    static JPanel screenCuteDressHairclip = new JPanel();
    static JPanel screenCuteDressHairband = new JPanel();
    static JPanel screenCuteDressJewelry = new JPanel();
    static JPanel screenCuteDressEarrings = new JPanel();
    static JPanel screenCuteDressNecklace = new JPanel();
    static StyleSavvy styleSavvy;

    static Screen Original = new Screen(screenOriginal);
    static Screen Current = Original;

    static JPanel[] allPanels = {
            screenOriginal,
            screenCute,
            screenCuteDress,
            screenAlt,
            screenAltDress,
            screenAltTop,
            screenCuteTop,
            screenAltBottoms,
            screenAltSkirt,
            screenCutePants,
            screenCuteSkirt,
            screenCuteSkirtHair,
            screenCuteSkirtHairclip,
            screenCuteSkirtHairband,
            screenCuteSkirtJewelry,
            screenCuteSkirtEarrings,
            screenCuteSkirtNecklace,
            screenCutePantsHair,
            screenCutePantsHairclip,
            screenCutePantsHairband,
            screenCutePantsJewelry,
            screenCutePantsEarrings,
            screenCutePantsNecklace,
            screenCuteDressHair,
            screenCuteDressHairclip,
            screenCuteDressHairband,
            screenCuteDressJewelry,
            screenCuteDressEarrings,
            screenCuteDressNecklace,
            screenAltSkirtHair,
            screenAltSkirtHairclip,
            screenAltSkirtHairband,
            screenAltSkirtJewelry,
            screenAltSkirtEarrings,
            screenAltSkirtNecklace,
            screenAltPantsHair,
            screenAltPantsHairclip,
            screenAltPantsHairband,
            screenAltPantsJewelry,
            screenAltPantsEarrings,
            screenAltPantsNecklace,
            screenAltDressHair,
            screenAltDressHairclip,
            screenAltDressHairband,
            screenAltDressJewelry,
            screenAltDressEarrings,
            screenAltDressNecklace,
    };

    // this is taken from the morsecode activity and tweaked a bit(made setup public
    // so that I can call it in my main file)
    public static void setup() throws Exception {
        if (Screen.isSetup)
            return;
        Screen.isSetup = true;

        // cute path (dress route)
        Original.left = new Screen(screenCute);
        Original.left.right = new Screen(screenCuteDress);
        Original.left.right.left = new Screen(screenCuteDressHair);
        Original.left.right.left.left = new Screen(screenCuteDressHairclip);
        Original.left.right.left.right = new Screen(screenCuteDressHairband);
        Original.left.right.right = new Screen(screenCuteDressJewelry);
        Original.left.right.right.left = new Screen(screenCuteDressEarrings);
        Original.left.right.right.right = new Screen(screenCuteDressNecklace);

        // cute path (shirt route)
        Original.left.left = new Screen(screenCuteTop);
        Original.left.left.left = new Screen(screenCutePants);
        Original.left.left.left.left = new Screen(screenCutePantsHair);
        Original.left.left.left.left.left = new Screen(screenCutePantsHairclip);
        Original.left.left.left.left.right = new Screen(screenCutePantsHairband);
        Original.left.left.left.right = new Screen(screenCutePantsJewelry);
        Original.left.left.left.right.left = new Screen(screenCutePantsEarrings);
        Original.left.left.left.right.right = new Screen(screenCutePantsNecklace);
        Original.left.left.right = new Screen(screenCuteSkirt);
        Original.left.left.right.left = new Screen(screenCuteSkirtHair);
        Original.left.left.right.left.left = new Screen(screenCuteSkirtHairclip);
        Original.left.left.right.left.right = new Screen(screenCuteSkirtHairband);
        Original.left.left.right.right = new Screen(screenCuteSkirtJewelry);
        Original.left.left.right.right.left = new Screen(screenCuteSkirtEarrings);
        Original.left.left.right.right.right = new Screen(screenCuteSkirtNecklace);

        // alt path(dress route)
        Original.right = new Screen(screenAlt);
        Original.right.left = new Screen(screenAltTop);
        Original.right.right = new Screen(screenAltDress);
        Original.right.right.left = new Screen(screenAltDressHair);
        Original.right.right.left.left = new Screen(screenAltDressHairclip);
        Original.right.right.left.right = new Screen(screenAltDressHairband);
        Original.right.right.right = new Screen(screenAltDressJewelry);
        Original.right.right.right.left = new Screen(screenAltDressEarrings);
        Original.right.right.right.right = new Screen(screenAltDressNecklace);

        // alt path(shirt route)
        Original.right.left.left = new Screen(screenAltBottoms);
        Original.right.left.left.left = new Screen(screenAltPantsHair);
        Original.right.left.left.left.left = new Screen(screenAltPantsHairclip);
        Original.right.left.left.left.right = new Screen(screenAltPantsHairband);
        Original.right.left.left.right = new Screen(screenAltPantsJewelry);
        Original.right.left.left.right.left = new Screen(screenAltPantsEarrings);
        Original.right.left.left.right.right = new Screen(screenAltPantsNecklace);
        Original.right.left.right = new Screen(screenAltSkirt);
        Original.right.left.right.left = new Screen(screenAltSkirtHair);
        Original.right.left.right.left.left = new Screen(screenAltSkirtHairclip);
        Original.right.left.right.left.right = new Screen(screenAltSkirtHairband);
        Original.right.left.right.right = new Screen(screenAltSkirtJewelry);
        Original.right.left.right.right.left = new Screen(screenAltSkirtEarrings);
        Original.right.left.right.right.right = new Screen(screenAltSkirtNecklace);
        styleSavvy = new StyleSavvy();

    }

    // This stuff is taken from the morsecode exercise we did and just kinda tweaked
    public static class Screen {
        Screen left;
        Screen right;
        JPanel panel;
        private static boolean isSetup = false;
        static Screen start;

        Screen(JPanel panel) {
            this.panel = panel;

            // start is always null because it's not initialized so this will make the
            // starting screen
            if (start == null) {
                start = this;
            }
        }

    }

    public static void getNextScreen(String choice) {
        if (choice == "button1") {
            Current = Current.left;
        } else if (choice == "button2") {
            Current = Current.right;
        }
        styleSavvy.setScreen(Current.panel);
    }
}