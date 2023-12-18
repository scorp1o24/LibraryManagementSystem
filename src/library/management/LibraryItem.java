package library.management;

public class LibraryItem {
    private String ID;
    private String title;
    private String[] authorsAndArtists;

    public LibraryItem(String ID, String title, String[] authorsAndArtists){
        this.ID = ID;
        this.title = title;
        this.authorsAndArtists = authorsAndArtists;
    }
}
