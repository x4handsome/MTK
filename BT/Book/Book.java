package Builder.Book;

import Builder.Computer.Computer;

public class Book {
    String name, author, chapter;
    int page;

    public Book(String name, String author, String chapter, int page) {
        this.name = name;
        this.author = author;
        this.chapter = chapter;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", chapter='" + chapter + '\'' +
                ", page=" + page +
                '}';
    }

    public static class Builder {
        private String name, author, chapter;
        private int page;

        public Builder addName(String name) {
            this.name = name;
            return this;
        }

        public Builder addAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder addChapter(String chapter) {
            this.chapter = chapter;
            return this;
        }

        public Builder addPage(int page) {
            this.page = page;
            return this;
        }

        public Book build() {
            return new Book(name, author, chapter, page);
        }

    }
}
