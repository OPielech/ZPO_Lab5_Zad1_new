import java.util.Comparator;

public class NameComparator implements Comparator <TennisPlayer> {

    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
