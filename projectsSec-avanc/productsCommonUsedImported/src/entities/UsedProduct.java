package entities;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct(String name, Double price) {
        super(name, price);
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName()
                + " ( used ) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + getManufactureDate()
                + " )";
    }
}
