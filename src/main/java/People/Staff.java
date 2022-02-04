package People;

public abstract class Staff extends Person{

    private Rank rank;

    protected Staff(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }
}
