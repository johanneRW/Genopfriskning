package company.sortering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    Scanner scanner = new Scanner(System.in);

    public void printListAlphabetically() {
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("skriv et ord:");
            String word = scanner.next().trim();
            words.add(word);
        }

        Collections.sort(words, Collections.reverseOrder());
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.printListAlphabetically();
    }
}