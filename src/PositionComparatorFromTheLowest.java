import java.util.Comparator;

public class PositionComparatorFromTheLowest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o1.getPosition(), o2.getPosition());
    }
}//end of class
