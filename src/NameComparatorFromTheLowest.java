import java.util.Comparator;

public class NameComparatorFromTheLowest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
