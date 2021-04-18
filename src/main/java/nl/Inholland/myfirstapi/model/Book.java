package nl.Inholland.myfirstapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Book
{
    private UUID ISBN; // I know ISBN is a number but Im too lazy, okay?!
    private String title;
    private String publisher;
    private int copies;
    //@JsonProperty("author")
    private Author author; // because why not? I wanna know how to make it with a nested object too xD

    public Book(String title, String publisher, int copies, Author author)
    {
        this.ISBN = UUID.randomUUID();
        this.title = title;
        this.publisher = publisher;
        this.copies = copies;
        this.author = author;
    }

    public UUID getISBN()
    {
        return ISBN;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public int getCopies()
    {
        return copies;
    }

    public void setCopies(int copies)
    {
        this.copies = copies;
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Book{" + "ISBN=" + ISBN + ", title='" + title + '\'' + ", publisher='" + publisher + '\'' + ", copies=" + copies + ", author=" + author + '}';
    }
}
