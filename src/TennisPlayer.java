public class TennisPlayer implements Comparable<TennisPlayer> {
    private final int position;
    private final String nationality;
    private final String name;
    private final String lastName;
    private final int age;
    private final int points;
    private final int numberOfTournaments;

    public TennisPlayer(int position, String nationality, String name, String lastName, int age, int points, int numberOfTournaments) {
        this.position = position;
        this.nationality = nationality;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.points = points;
        this.numberOfTournaments = numberOfTournaments;
    }//end of constructor

    public int getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPoints() {
        return points;
    }

    public int getNumberOfTournaments() {
        return numberOfTournaments;
    }

    @Override
    public int compareTo(TennisPlayer tennisPlayer) {
        return Integer.compare(age, tennisPlayer.age);
    }

    @Override
    public String toString() {
        return "Position: " + position
                + ", nationality: " + nationality
                + ", name: " + name
                + ", last name: " + lastName
                + ", age: " + age
                + ", points: " + points
                + ", number of tournaments: " + numberOfTournaments
                + "\n";
    }
}//end of class
