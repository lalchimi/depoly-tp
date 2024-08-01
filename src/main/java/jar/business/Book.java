package jar.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Year;

@Entity
@Table(name = "books")
public class Book {
    // Attribute
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private int publishedYear;
    private static int count;

    //default constructor

    public Book() {

    }

    public Book(String title, String author, int publishedYear) {
        this.id = ++count;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    // get & set

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return this.publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
     int currentYear = Year.now().getValue();
        return (currentYear - this.publishedYear );
    }
    // Display

    public String toString() {
        return "ID : " + id + " Title : " + title + " Author : " + author + " Published Year : " + publishedYear;
    }
}
