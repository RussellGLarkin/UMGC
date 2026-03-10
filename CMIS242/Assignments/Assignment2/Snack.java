package Assignment2;

import java.text.DecimalFormat;

public class Snack {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private String id;
    private String size;
    private double price;

    public Snack(String id, String size) {
        this.id = id;
        this.size = size.toUpperCase();
    }

    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sizePrice() {
        switch (size) {
            case "S": price = 19.99; break;
            case "M": price = 29.99; break;
            case "L": price = 39.99; break;
            default: price = 0.0;
        }
    }

    public String formatPrice() {
        return "$" + df.format(price);
    }
}