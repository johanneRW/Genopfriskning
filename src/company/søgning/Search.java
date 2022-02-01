package company.søgning;

public class Search {

    public int searchForStringInArray(String[] stringList, String searchString) throws Exception {

        for (int i = 0; i < stringList.length; i++) {
            String currentString = stringList[i];
            if (currentString.equals(searchString)) {
                int index = i;
                return index;
            }
        }
        throw new Exception("String can't be found");

    }

    public static void main(String[] args) throws Exception {
        Search search = new Search();
        String[] strings = {"dette er en string", "dette er en anden", "dette er en tredje", "osv. osv"};
        int indexOfWord=search.searchForStringInArray(strings, "osv. osv");
        System.out.println(indexOfWord);

    }
}
