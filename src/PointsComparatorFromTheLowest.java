import java.util.Comparator;

public class PointsComparatorFromTheLowest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o1.getPoints(), o2.getPoints());
    }
}
