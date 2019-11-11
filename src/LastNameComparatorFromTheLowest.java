import java.util.Comparator;

public class LastNameComparatorFromTheLowest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }
}
