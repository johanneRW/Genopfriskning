package company.kvadrat;

public class Square {

    public void printSquare(int numberOfRows, String symbol) {

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.printSquare(16, "*");
    }
}
