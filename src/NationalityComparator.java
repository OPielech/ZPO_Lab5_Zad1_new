import java.util.Comparator;

public class NationalityComparator implements Comparator <TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o1.getNationality().compareTo(o2.getNationality());
    }
}//end of class
