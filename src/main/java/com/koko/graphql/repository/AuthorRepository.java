package com.koko.graphql.repository;

import com.koko.graphql.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}