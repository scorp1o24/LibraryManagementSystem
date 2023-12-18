package library.management;

public class DVD extends LibraryItem{
    private int duration;

    public DVD(String ID, String title, String[] authorsAndArtists,int duration){
        super(ID,title,authorsAndArtists);
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
}
