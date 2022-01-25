public class Book {
    private final String name;
    private final String author;
    private final int pageNumber;
    private final int isbnNumber;

    public Book(String name, String author, int pageNumber, int isbnNumber) {
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.isbnNumber = isbnNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }
}
