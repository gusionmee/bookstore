package com.bansach.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "categories", schema = "bookstore")
public class CategoriesEntity extends BaseEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id")
    private int categoryId;
    @Basic
    @Column(name = "category_name")
    private String categoryName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "book_category",
            joinColumns=@JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    Set<BooksEntity> books=new HashSet<>();

}
