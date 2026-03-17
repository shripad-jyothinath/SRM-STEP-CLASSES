public class OOPSBannerApp {

    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        String[] oPattern = {
            "  **** ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  **** "
        };

        String[] pPattern = {
            " ****** ",
            " *    * ",
            " *    * ",
            " ****** ",
            " * ",
            " * ",
            " * "
        };

        String[] sPattern = {
            "  **** ",
            " * * ",
            " * ",
            "  **** ",
            "      * ",
            " * * ",
            "  **** "
        };

        String[] spacePattern = {
            "      ",
            "      ",
            "      ",
            "      ",
            "      ",
            "      ",
            "      "
        };

        charMaps[0] = new CharacterPatternMap('O', oPattern);
        charMaps[1] = new CharacterPatternMap('P', pPattern);
        charMaps[2] = new CharacterPatternMap('S', sPattern);
        charMaps[3] = new CharacterPatternMap(' ', spacePattern);

        return charMaps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter().equals(ch)) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[i]).append("  ");
            }
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}