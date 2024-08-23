package com.bookstore.api.BookstoreAPI.Book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class BookDTO {

    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Size(min = 1, max = 100)
    private String title;

    @NotBlank(message = "Author is mandatory")
    @Size(min = 1, max = 100)
    private String author;

    @NotNull(message = "Price is mandatory")
    private Double price;

    @NotBlank(message = "ISBN is mandatory")
    @Size(min = 10, max = 13)
    private String isbn;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}