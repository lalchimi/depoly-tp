package jar.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

import jar.business.Book;
import jar.business.HibernateConfig;

public class BookService {
    public void addBook(Book book) {
                Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(book);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Book> getBooks() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from books :", Book.class).list();
        }
    }
}
