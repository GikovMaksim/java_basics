public class Guitar {
    private String name;
    private double numberOfString;
    private boolean isUsed;
    private int price;

    public Guitar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfString() {
        return numberOfString;
    }

    public void setNumberOfString(double numberOfString) {
        this.numberOfString = numberOfString;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
