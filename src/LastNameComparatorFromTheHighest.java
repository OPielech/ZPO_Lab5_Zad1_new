import java.util.Comparator;

public class LastNameComparatorFromTheHighest implements Comparator <TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o2.getLastName().compareToIgnoreCase(o1.getLastName());
    }
}//end of class
