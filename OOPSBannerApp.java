import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patterns = getPatterns();

        String word = "OOPS";

        printBanner(word, patterns);
    }

    // Method to create patterns map
    public static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    // Method to print banner
    public static void printBanner(String word, Map<Character, String[]> map) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);
                String[] pattern = map.get(ch);

                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}
