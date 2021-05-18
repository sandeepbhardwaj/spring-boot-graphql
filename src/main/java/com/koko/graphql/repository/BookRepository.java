package com.koko.graphql.repository;

import com.koko.graphql.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}