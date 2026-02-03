/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library \n");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("Lord of the Rings", "Tolkien");
    System.out.println("Book Created " + myBook);
    myLib.addBook(myBook);
    myLib.toString();
    System.out.println("Library contains: " + myLib);
    myBook.setTitle("Of Mice and Men");
    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    System.out.println("Updated book title: " + myBook.getTitle());
    System.out.println("Updated library: " + myLib);
    Book currBook = myLib.getBook();
    currBook.setTitle("My Favorite Book"); ///Title change
    System.out.println("Current book: " + currBook);
    System.out.println(myLib);


    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);


    System.out.println("before test:" + newBook);
    myLib.testBook(newBook);
    System.out.println("after test:" + newBook);

    Book newBook2 = new Book("Lord of the Rings", "Tolkien");
    newBook.equals(newBook2);
    
    System.out.println("Test Movie Class");

    Movie myMovie = new Movie("The Matrix", 136.0);
    System.out.println("Movie Created: " + myMovie);
    myLib.addMovie(myMovie);
    myMovie.adjustRating(9);
    System.out.println("Updated movie: " + myMovie);
    System.out.println("Updated library with movie: " + myLib);
    
    Movie myMovie2 = new Movie("The Matrix", 136.0);
    System.out.println("Equals method output: " + myMovie.equals(myMovie2));
    
    Movie myMovie3 = new Movie("Inception", 148.0);
    System.out.println("Equals method output " + myMovie.equals(myMovie3));
    
  }
}