import java.util.Comparator;

public class PositionComparatorFromTheHighest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o2.getPosition(), o1.getPosition());
    }
}
