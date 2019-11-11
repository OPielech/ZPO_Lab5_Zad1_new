import java.util.Comparator;

public class NationalityComparatorFromTheHighest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o2.getNationality().compareToIgnoreCase(o1.getNationality());
    }
}
