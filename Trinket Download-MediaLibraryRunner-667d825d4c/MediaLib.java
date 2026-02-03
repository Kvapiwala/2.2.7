/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  
  public Book getBook()
  {
   return book;
  }
  public Movie getMovie() {
    return movie;
  }
  public void addBook(Book b)
  {
    book = b;
  }
  public void addMovie(Movie m) {
    movie = m;
  }

  public String toString() 
  {
    String info = "";
    if (book != null) {
      info += book.toString();
    } else {
      info += "No books available";
    }
    info += "\n";
    if (movie != null) {
      info += movie.toString();
    } else {
      info += "No movies available";
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