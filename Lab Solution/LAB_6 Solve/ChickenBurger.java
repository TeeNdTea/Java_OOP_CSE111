public class ChickenBurger {
    public String bun;
    public int price;
    public String sauceOption;
    public String spiceLevel;
    public String[] spiceLevels = {"Mild", "Spicy", "Naga", "Extreme"};

    public ChickenBurger() {
        bun = "Sesame";
        price = 200;
        sauceOption = "Less";
        spiceLevel = "Not Set";
    }

    public void customizeSpiceLevel(String level) {
        boolean validSpice = false;
        for (int i = 0; i < spiceLevels.length; i++) {
            if (level.length() == spiceLevels[i].length()) {
                boolean isEqual = true;
                for (int j = 0; j < level.length(); j++) {
                    if (level.charAt(j) != spiceLevels[i].charAt(j)) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    spiceLevel = spiceLevels[i];
                    System.out.println("Spice level set to " + spiceLevels[i] + ".");
                    validSpice = true;
                    break;
                }
            }
        }
        if (!validSpice) {
            System.out.println("This spice level is unavailable.");
        }
    }

    public String serveBurger() {
        if (spiceLevel.length() == 7) { 
            boolean isEqual = true;
            String notSet = "Not Set";
            for (int i = 0; i < spiceLevel.length(); i++) {
                if (spiceLevel.charAt(i) != notSet.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                return "Cannot serve now. Customize Spice Level first.";
            }
        }

        return "The burger is being served:-\n" +
               "Bun Type: " + bun + "\n" +
               "Price: " + price + "\n" +
               "Sauce Option: " + sauceOption + "\n" +
               "Spice Level: " + spiceLevel;
    }
}
