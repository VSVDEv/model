package ua.co.vsvdev.model.book;

import java.util.Collection;
import java.util.Objects;

public class Book {

    private String title;
    private String description;
    private double price;
    private Collection<String>genres;
    private Collection<String>authors;
    private int year;
    private int lists;

    public Book() {
    }

    public Book(String title, String description, double price, Collection<String> genres, Collection<String> authors, int year, int lists) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.genres = genres;
        this.authors = authors;
        this.year = year;
        this.lists = lists;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Collection<String> getGenres() {
        return genres;
    }

    public void setGenres(Collection<String> genres) {
        this.genres = genres;
    }

    public Collection<String> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<String> authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLists() {
        return lists;
    }

    public void setLists(int lists) {
        this.lists = lists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (year != book.year) return false;
        if (lists != book.lists) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        if (genres != null ? !genres.equals(book.genres) : book.genres != null) return false;
        if (authors != null ? !authors.equals(book.authors) : book.authors != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (genres != null ? genres.hashCode() : 0);
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + lists;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", genres=" + genres +
                ", authors=" + authors +
                ", year=" + year +
                ", lists=" + lists +
                '}';
    }
}
