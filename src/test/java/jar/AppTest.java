package jar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jar.business.Book;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAge()
    {
        Book book = new Book("test", "test", 2020);
        assertEquals(4, book.getAge());
    }
}
