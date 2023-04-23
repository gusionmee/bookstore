package com.bansach.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "books", schema = "bookstore")
public class BooksEntity  extends BaseEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "book_id")
    private int bookId;
    @Basic
    @Column(name = "book_title")
    private String bookTitle;
    @Basic
    @Column(name = "author_name")
    private String authorName;
    @Basic
    @Column(name = "publisher_name")
    private String publisherName;
    @Basic
    @Column(name = "publication_year")
    private int publicationYear;
    @Basic
    @Column(name = "isbn")
    private String isbn;
    @Basic
    @Column(name = "price")
    private BigDecimal price;

    @ManyToMany(mappedBy = "books")
    Set<CategoriesEntity> categoriesEntitys=new HashSet<>();

}
