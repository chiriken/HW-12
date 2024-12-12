public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Михаил", "Шолохов");

        Book book1 = new Book("Анна Каренина", author1, 1877 );
        Book book2 = new Book("Тихий Дон", author2, 1925);

        System.out.println("Book 1: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());
        System.out.println("Book 2: " + book2.getTitle() +", Author: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Year: " + book2.getPublicationYear());

        book1.setPublicationYear(1990);

        System.out.println("Updated Book 1: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Year: " + book1.getPublicationYear());
    }



}