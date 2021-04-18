package nl.Inholland.myfirstapi.controller;


import nl.Inholland.myfirstapi.model.Book;
import nl.Inholland.myfirstapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value= "books")
public class BookController
{
    @Autowired
    private BookService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Book>> getBooks()
    {
        return ResponseEntity.status(200).body(service.getBooks());
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> createGuitar(@RequestBody Book book)
    {
        service.createBook(book);
        return ResponseEntity.status(201).body(book);
    }



}
