package RestarauntSYS;

public class Food {
    private String nationality;
    private String dish;
    private String description;
    private int price;

    public Food() {
        this("Empty","Empty","Empty",0);
    }

    public Food(String nationality, String dish, String description, int price){
        setNationality(nationality);
        setDish(dish);
        setDescription(description);
        setPrice(price);

    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDish() {
        return dish;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return ("Nationality:  "+ getNationality() + "      Dish:  "+ getDish() +"      Description:  " + getDish()+ "      Price:  "+ getPrice() );
    }
}
