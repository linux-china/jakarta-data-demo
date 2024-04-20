package org.mvnsearch;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JpaTest {
    private static EntityManager em;

    @BeforeAll
    public static void setUp() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.mvnsearch.jpa_demo");
        em = emf.createEntityManager();
    }

    @AfterAll
    public static void tearDown() {
        if (em != null) {
            em.close();
        }
    }

    @Test
    public void testBasicTest() {
        Book book = em.find(Book.class, 2);
        System.out.println(book.getTitle());
    }
}