package Assignment2;

public class FruitSnack extends Snack {
    private boolean includeCitrus;

    public FruitSnack(String id, String size, boolean includeCitrus) {
        super(id, size);
        this.includeCitrus = includeCitrus;
        sizePrice();
    }

    @Override
    public void sizePrice() {
        super.sizePrice();
        if (includeCitrus) {
            setPrice(getPrice() + 5.99);
        }
    }

    public boolean isIncludeCitrus() {
        return includeCitrus;
    }

    public void setIncludeCitrus(boolean includeCitrus) {
        this.includeCitrus = includeCitrus;
    }

    @Override
    public String toString() {
        return "You have chosen snack type = Fruit Snack, of type = " + getSize() +
               ", id = " + getId() + ", price = " + formatPrice() + "\n";
    }
}