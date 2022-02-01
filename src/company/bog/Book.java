package company.bog;

public class Book {
    private String isbnNumber;
    private String title;
    private int yearPublished;

    public Book(String isbnNumber, String title, int yearPublished) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.yearPublished = yearPublished;
    }


    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }


    @Override
    public String toString() {
        return title + ", " + isbnNumber + ", " + yearPublished;
    }
}
