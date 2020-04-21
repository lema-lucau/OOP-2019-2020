package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class myProduct extends PApplet {
    private String name;
    private float price;

    public myProduct(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public myProduct() {
        this("", 0);
    }

    public myProduct(TableRow tr) {
        this(
            tr.getString("Name"),
            tr.getFloat("Price")
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "Name: " + this.name + " € " + this.price;
    }
}