package Assignment2;

public class SaltySnack extends Snack {
    private boolean includeNuts;

    public SaltySnack(String id, String size, boolean includeNuts) {
        super(id, size);
        this.includeNuts = includeNuts;
        sizePrice();
    }

    @Override
    public void sizePrice() {
        super.sizePrice();
        if (includeNuts) {
            setPrice(getPrice() + 4.50);
        }
    }

    public boolean isIncludeNuts() {
        return includeNuts;
    }

    public void setIncludeNuts(boolean includeNuts) {
        this.includeNuts = includeNuts;
    }

    @Override
    public String toString() {
        return "You have chosen snack type = Salty Snack, of type = " + getSize() +
               ", id = " + getId() + ", price = " + formatPrice() + "\n";
    }
}