public class Main {
    public static void main(String[] args) {
        Author johnTolkien = new Author("John", "Tolkien");
        Author joanneRowling = new Author("Joanne", "Rowling");

        Book theLordOfTheRings = new Book("The Lord of the Rings", 1954, johnTolkien);
        Book harryPotter = new Book("Harry Potter", 1997, joanneRowling );

        System.out.println(theLordOfTheRings);
        System.out.println(harryPotter);

        theLordOfTheRings.setPublishingYear(1955);
        harryPotter.setPublishingYear(2001);

        System.out.println(theLordOfTheRings);
        System.out.println(harryPotter);
    }
}