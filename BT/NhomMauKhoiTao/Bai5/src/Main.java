
public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .addName("Tri tue nhan tao")
                .addChapter("5")
                .addPage(250)
                .addAuthor("Dang Le Hoai Nhi")
                .build();
        System.out.println(book.toString());

    }
}
