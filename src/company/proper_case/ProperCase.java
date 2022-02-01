package company.proper_case;

public class ProperCase {

    public String properCase(String lineInput) {

        String[] wordList = lineInput.split(" ");
        String properWord;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wordList.length; i++) {
            String word = wordList[i];

            if (word.equals(word.toUpperCase())) {
                properWord = word;
            } else if (word.length() > 3) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                properWord = firstLetter + restOfWord;
            } else {
                properWord = word.toLowerCase();
            }

            sb = sb.append(properWord + " ");
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        ProperCase properCase = new ProperCase();

        String line = properCase.properCase("DETTE er en Fin test");
        System.out.println(line);
    }
}