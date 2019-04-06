package com.piotrgz.ncdcbackend.books;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Book {

    @Id
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false)
    private String authorFirstName;
    @Column(nullable = false)
    private String authorLastName;
    @Column(nullable = false)
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
