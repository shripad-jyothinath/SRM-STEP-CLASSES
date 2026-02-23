public class file_uc6 {
    public static String[] getOpattern() {
        return new String[] {
            "    ***    ",
            "  **   **  ",
            " **     ** ",
            " **     ** ",
            " **     ** ",
            "   ** **   "
        };
    }
    public static String[] getSpattern() {
        return new String[] {
            "  ****** ",
            " ***     ",
            "   ***** ",
            "      ***",
            "    ***  ",
            " ***     "
        };
    }
    public static String[] getPpattern() {
        return new String[] {
            "******* ",
            "**    **",
            "**   ** ",
            "** **   ",
            "**      ",
            "**      "
        };
    }
    public static void main(String[] args) {
        String[] oPattern = getOpattern();
        String[] sPattern = getSpattern();
        String[] pPattern = getPpattern();
        for (int i = 0; i < oPattern.length; i++) {
        System.out.println(oPattern[i] + " " + oPattern[i] + "" + pPattern[i] + " " + sPattern[i]);
        }
    }
}