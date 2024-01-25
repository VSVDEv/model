package ua.co.vsvdev.model.book;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BookTest {


    @Test
    public void testEquals(){
        Book first = new Book("Effective Java", "Book about effective programming in Java",
        77.0, Set.of(BookGenre.IT.toString(),BookGenre.SELF_HELP.name()), Set.of("Bloch"), 2018, 700);

        Book second = new Book("Effective Java", "Book about effective programming in Java",
                77.0, Set.of(BookGenre.IT.toString(),BookGenre.SELF_HELP.name()), Set.of("Bloch"), 2018, 700);

        assertEquals(first, second);

        Book third = new Book("Effective Python", "Book about effective programming in Java",
                77.0, Set.of(BookGenre.IT.toString(),BookGenre.SELF_HELP.name()), Set.of("Bloch"), 2018, 700);

        assertNotEquals(first, third);
    }

    @Test
    public void testSetter(){
        Book first = new Book("Effective Java", "Book about effective programming in Java",
                77.0, Set.of(BookGenre.IT.toString(),BookGenre.SELF_HELP.name()), Set.of("Bloch"), 2018, 700);

        Set<String>updatedAuthors = Set.of("Bloch", "Me");
        first.setAuthors(updatedAuthors);

        assertEquals(updatedAuthors, first.getAuthors());

    }
}