package com.koko.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.koko.graphql.entity.Author;
import com.koko.graphql.entity.Book;
import com.koko.graphql.repository.AuthorRepository;

import java.util.Optional;

public class BookResolver implements GraphQLResolver<Book> {
	private AuthorRepository authorRepository;

	public BookResolver(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public Optional<Author> getAuthor(Book book) {
		return authorRepository.findById(book.getAuthor().getId());
	}
}