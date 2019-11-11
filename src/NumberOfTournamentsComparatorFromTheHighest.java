import java.util.Comparator;

public class NumberOfTournamentsComparatorFromTheHighest implements Comparator<TennisPlayer> {
    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o2.getNumberOfTournaments(),o1.getNumberOfTournaments());
    }
}
