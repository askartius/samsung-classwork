package domain;

public class Parcel {
    private int id;
    private int weight;
    public class Destination {
        public String streetName;
        public int houseNumber;
        public int apartment;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }
}