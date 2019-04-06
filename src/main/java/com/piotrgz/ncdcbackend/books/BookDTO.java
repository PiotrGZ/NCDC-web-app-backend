package com.piotrgz.ncdcbackend.books;

import org.hibernate.validator.constraints.ISBN;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

class BookDTO {

    @ISBN(message = "Please enter valid ISBN-13 number")
    private String isbn;
    @NotBlank
    @Pattern(regexp = "A.*", message = "Author name must starts with A")
    private String authorFirstName;
    @NotBlank
    @Pattern(regexp = "A.*", message = "Author last name must starts with A")
    private String authorLastName;
    @NotBlank
    private String title;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
