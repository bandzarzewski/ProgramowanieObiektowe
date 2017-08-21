package BookAndAuthor;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("Tolkien", "email", 'm');
        System.out.println(tolkien);

        Book book = new Book("LotR", tolkien, 24.78, 4);
//        Book book2=new Book("LotR",new Author("Tolkien", "email", 'm'),24.78);
        System.out.println(book);
    }
}