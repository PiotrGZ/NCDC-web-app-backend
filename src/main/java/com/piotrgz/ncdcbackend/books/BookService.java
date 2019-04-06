package com.piotrgz.ncdcbackend.books;

import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
class BookService {
    private BookRepository bookRepository;

    private BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    List<BookDTO> getAllBooks() {
        return Lists.newArrayList(bookRepository.findAll()).stream().map(this::convertToDto).collect(Collectors.toList());
    }

    BookDTO addBook(BookDTO bookDTO) {
        if (bookRepository.findById(bookDTO.getIsbn()).isPresent()) {
            throw new EntityAlreadyExistsException("Book with ISBN: " + bookDTO.getIsbn() + " already exists!");
        }
        return convertToDto(bookRepository.save(convertToEntity(bookDTO)));
    }

    private BookDTO convertToDto(Book book) {
        BookDTO bookDTO = new BookDTO();
        BeanUtils.copyProperties(book, bookDTO);
        return bookDTO;
    }

    private Book convertToEntity(BookDTO bookDTO) {
        Book book = new Book();
        BeanUtils.copyProperties(bookDTO, book);
        return book;
    }
}
