package library.management;

import java.util.EnumMap;
import java.util.HashMap;

public class Library<T extends LibraryItem>  {
    private EnumMap<ItemType,T> enumMap;
    public Library(){
        enumMap = new EnumMap<ItemType,T>(ItemType.class);
    }

    public void addLibraryItem(ItemType type, String ID, String title, String[] authorsAndArtists,int attribute){
        switch (type){
            case CD -> enumMap.put(type, (T) new CD(ID,title,authorsAndArtists,attribute));
            case DVD -> enumMap.put(type, (T) new DVD(ID,title,authorsAndArtists,attribute));
            case BOOK -> enumMap.put(type, (T) new Book(ID,title,authorsAndArtists,attribute));
        }
    }
}
