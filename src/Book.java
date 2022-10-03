import java.util.Objects;

public class Book {
    private final Author author;
    private final String publisherName; // Название
    private int publishingYear; // Год публикации

    public Book(String publisherName, int publishingYear, Author author) {
        this.author = author;
        this.publisherName = publisherName;
        this.publishingYear = publishingYear;
    }
    public String getPublisherName() {
        return this.publisherName;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " + this.publisherName + " Автор: " + this.author + " Год публикации: " + this.publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(author, book.author) && Objects.equals(publisherName, book.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, publisherName, publishingYear);
    }
}
