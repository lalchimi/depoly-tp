package jar;

import jar.business.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Book book = new Book("Good omen", "Terry Pratchett", 1990);

      System.out.println(book.getAge());
    }
}
