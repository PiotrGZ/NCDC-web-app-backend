package com.piotrgz.ncdcbackend.books;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    private BookService bookService;

    private BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    private BookDTO addBook(@Valid @RequestBody BookDTO bookDTO) {
        return bookService.addBook(bookDTO);
    }

    @GetMapping
    private List<BookDTO> getAll() {
        return bookService.getAllBooks();
    }
}
