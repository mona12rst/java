package nl.Inholland.myfirstapi.service;

import nl.Inholland.myfirstapi.model.Author;
import nl.Inholland.myfirstapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService
{
    private List<Book> books = new ArrayList<>();

    public BookService()
    {
        Author author1 = new Author("Mona", "Rostami");
        Author author2 = new Author("Michael", "Brancatto");

        this.books = new ArrayList<>
                (
                        List.of
                                (
                                        new Book("How to survive IT", "M.RST", 500, author1),
                                        new Book("How to not be a good cook", "M.RST", 200000, author2)

                                )
                );
    }
    public List<Book> getBooks()
    {
        return this.books;
    }

    public Book createBook(Book book)
    {
        books.add(book);
        return book;
    }
}
