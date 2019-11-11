import java.util.Comparator;

public class NumberOfTournamentsComparatorFromTheLowest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o1.getNumberOfTournaments(), o2.getNumberOfTournaments());
    }
}
