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
    static JPanel screenCuteJeans = new JPanel();
    static JPanel screenCuteSkirt = new JPanel();
    static JPanel screenCuteHair = new JPanel();
    static JPanel screenCuteHairband = new JPanel();
    static JPanel screenCuteHairclip = new JPanel();
    static JPanel screenCuteJewelry = new JPanel();
    static JPanel screenCuteJewelryEarrings = new JPanel();
    static JPanel screenCuteJewelryNecklace = new JPanel();
    static JPanel screenAltHair = new JPanel();
    static JPanel screenAltBoldHair = new JPanel();
    static JPanel screenAltNaturalHair = new JPanel();
    static JPanel screenAltMakeup = new JPanel();
    static JPanel screenAltHeavyMakeup = new JPanel();
    static JPanel screenAltLightMakeup = new JPanel();
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
            screenCuteJeans,
            screenCuteSkirt,
            screenCuteHair,
            screenCuteHairband,
            screenCuteHairclip,
            screenCuteJewelry,
            screenCuteJewelryEarrings,
            screenCuteJewelryNecklace,
            screenAltHair,
            screenAltBoldHair,
            screenAltNaturalHair,
            screenAltMakeup,
            screenAltHeavyMakeup,
            screenAltLightMakeup
    };

    //this is taken from the morsecode activity and tweaked a bit(made setup public
    //so that I can call it in my main file)
    public static void setup() {
        if (Screen.isSetup)
            return;
        Screen.isSetup = true;

        // cute path (dress route)
        Original.left = new Screen(screenCute);
        Original.left.left = new Screen(screenCuteTop);
        Original.left.right = new Screen(screenCuteDress);
        Original.left.right.left = new Screen(screenCuteHair);
        Original.left.right.left.left = new Screen(screenCuteHairclip);
        Original.left.right.left.right = new Screen(screenCuteHairband);
        Original.left.right.right = new Screen(screenCuteJewelry);
        Original.left.right.right.left = new Screen(screenCuteJewelryEarrings);
        Original.left.right.right.right = new Screen(screenCuteJewelryNecklace);

        //cute path (shirt route)
        Original.left.left.left = new Screen(screenCuteJeans);
        Original.left.left.left.left = new Screen(screenCuteHair);
        Original.left.left.left.left.left = new Screen(screenCuteHairclip);
        Original.left.left.left.left.right = new Screen(screenCuteHairband);
        Original.left.left.left.right = new Screen(screenCuteJewelry);
        Original.left.left.left.right.left = new Screen(screenCuteJewelryEarrings);
        Original.left.left.left.right.right = new Screen(screenCuteJewelryNecklace);
        Original.left.left.right = new Screen(screenCuteSkirt);
        Original.left.left.right.left = new Screen(screenCuteHair);
        Original.left.left.right.left.left = new Screen(screenCuteHairclip);
        Original.left.left.right.left.right = new Screen(screenCuteHairband);
        Original.left.left.right.right = new Screen(screenCuteJewelry);
        Original.left.left.right.right.left = new Screen(screenCuteJewelryEarrings);
        Original.left.left.right.right.right = new Screen(screenCuteJewelryNecklace);

        //alt path(dress route)
        Original.right = new Screen(screenAlt);
        Original.right.left = new Screen(screenAltTop);
        Original.right.right = new Screen(screenAltDress);
        Original.right.right.left = new Screen(screenAltHair);
        Original.right.right.left.left = new Screen(screenAltBoldHair);
        Original.right.right.left.right = new Screen(screenAltNaturalHair);
        Original.right.right.right = new Screen(screenAltMakeup);
        Original.right.right.right.left = new Screen(screenAltHeavyMakeup);
        Original.right.right.right.right = new Screen(screenAltLightMakeup);

        //alt path(shirt route)
        Original.right.left.left = new Screen(screenAltBottoms);
        Original.right.left.left.left = new Screen(screenAltHair);
        Original.right.left.left.left.left = new Screen(screenAltBoldHair);
        Original.right.left.left.left.right = new Screen(screenAltNaturalHair);
        Original.right.left.left.right = new Screen(screenAltMakeup);
        Original.right.left.left.right.left = new Screen(screenAltHeavyMakeup);
        Original.right.left.left.right.right = new Screen(screenAltLightMakeup);
        Original.right.left.right = new Screen(screenAltSkirt);
        Original.right.left.right.left = new Screen(screenAltHair);
        Original.right.left.right.left.left = new Screen(screenAltBoldHair);
        Original.right.left.right.left.right = new Screen(screenAltNaturalHair);
        Original.right.left.right.right = new Screen(screenAltMakeup);
        Original.right.left.right.right.left = new Screen(screenAltHeavyMakeup);
        Original.right.left.right.right.right = new Screen(screenAltLightMakeup);
        styleSavvy = new StyleSavvy();

    }

    //This stuff is taken from the morsecode exercise we did and just kinda tweaked
    public static class Screen {
        Screen left;
        Screen right;
        JPanel panel;
        private static boolean isSetup = false;
        static Screen start;

        Screen(JPanel panel) {
            this.panel = panel;

            //start is always null because it's not initialized so this will make the starting screen
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