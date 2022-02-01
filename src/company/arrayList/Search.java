package company.arrayList;

import java.util.ArrayList;

public class Search {

    public boolean doesArraylistContainString(ArrayList<String> wordList, String searchWord) {

        boolean wordFound = false;
        for (int i = 0; i < wordList.size(); i++) {
            String currentWord = wordList.get(i);
            if (searchWord.equalsIgnoreCase(currentWord)) {
                wordFound = true;
                System.out.println("The String has been found");
            }
        }
        if (!wordFound) {
            wordList.add(searchWord);
        }
        return wordFound;
    }


    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("test");
        wordList.add("prøve");

        Search search = new Search();
        String searchWord = "test";
        boolean isWordInList=search.doesArraylistContainString(wordList, searchWord);
        System.out.println(isWordInList);
        System.out.println(wordList);

    }
}