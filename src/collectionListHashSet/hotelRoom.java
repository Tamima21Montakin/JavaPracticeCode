package collectionListHashSet;

public class hotelRoom {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String name;
    public String type;
    public int capacity;
    public double rate;

    public hotelRoom(String name, String type, int capacity, double rate)
    {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;

    }
}
