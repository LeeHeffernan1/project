package RestarauntSYS;

public class Sales {
    private double price;

    public Sales(){
        this(0);
    }

    public Sales(double price) {
        setPrice(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Price: "+ getPrice();
    }
}
