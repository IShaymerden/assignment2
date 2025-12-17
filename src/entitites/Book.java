package entitites;

import java.util.Objects;

public class Book {
    private int pages;
    private String title;

    public Book(int pages, String title){
        this.pages = pages;
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, title);
    }
}
