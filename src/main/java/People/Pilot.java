package People;

public class Pilot extends Staff{

    private String licenceNum;

    public Pilot(String name, Rank rank, String licenceNum) {
        super(name, rank);
        this.licenceNum = licenceNum;
    }

    public String getLicenceNum() {
        return licenceNum;
    }


}
