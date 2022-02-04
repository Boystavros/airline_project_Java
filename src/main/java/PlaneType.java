public enum PlaneType {

    BOEING747(4, 10.0),
    AIRBUSA380(2, 8.0);

    private int capacity;
    private double weight;


    PlaneType(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
