import java.util.Comparator;

public class NationalityComparatorFromTheLowest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o1.getNationality().compareToIgnoreCase(o2.getNationality());
    }
}
