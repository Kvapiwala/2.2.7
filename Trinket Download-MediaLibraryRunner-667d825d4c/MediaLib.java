/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  public Book getBook()
  {
   return book;
  }
  public void addBook(Book b)
  {
    book = b;
  }

  public String toString() 
  {
    String info = "";
    if (book != null) {
      info += book.toString();
    } else {
      info += "No books available";
    }
    return info;
  }
  public void test()
  {}
  public void testBook(Book tester) {
    tester.setTitle("Pancho");
    System.out.println("Tester book title changed to: " + tester.getTitle());
  }
}