package People;

public class CabinCrewMember extends Staff {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }


    public String relayMessage() {
        return "Stow tables";
    }
}
