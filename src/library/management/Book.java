package library.management;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String ID, String title, String[] authorsAndArtists, int numberOfPages){
        super(ID,title,authorsAndArtists);
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
}
