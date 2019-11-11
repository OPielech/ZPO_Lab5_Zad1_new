import java.util.Comparator;

public class NameComparatorFromTheHighest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o2.getName().compareToIgnoreCase(o1.getName());
    }
}
