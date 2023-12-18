package library.management;

public class CD extends LibraryItem{
    private int numberOfTracks;
    public CD(String ID, String title, String[] authorsAndArtists, int numberOfTracks){
        super(ID,title,authorsAndArtists);
        this.numberOfTracks = numberOfTracks;
    }
    public int getNumberOfTracks(){
        return numberOfTracks;
    }
}
