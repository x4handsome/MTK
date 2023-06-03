package Builder.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .addName("Sách 1")
                .addChapter("5")
                .addPage(250)
                .addAuthor("Nguyễn Quốc Châu")
                .build();
        System.out.println(book.toString());

    }
}
