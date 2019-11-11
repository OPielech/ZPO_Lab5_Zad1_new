import java.util.Comparator;

public class PointsComparatorFromTheHighest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o2.getPoints(),o1.getPoints());
    }
}
