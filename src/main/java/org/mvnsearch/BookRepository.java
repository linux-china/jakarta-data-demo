package org.mvnsearch;

import jakarta.data.repository.Find;
import jakarta.data.repository.Repository;
import org.hibernate.StatelessSession;

@Repository
public interface BookRepository {
    StatelessSession session();

    @Find
    Book findByIsbn(String isbn);
}
