package org.mvnsearch;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Find;
import jakarta.data.repository.Repository;
import org.hibernate.StatelessSession;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    StatelessSession session();

    @Find
    Book findByIsbn(String isbn);
}
