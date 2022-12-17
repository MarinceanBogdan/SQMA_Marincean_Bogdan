package classes;

public class Car {
    private String brand;
    private int fabricationYear;
    private double price;

    public Car(String brand, int fabricationYear, double price) {
        this.brand = brand;
        this.fabricationYear = fabricationYear;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean hasWarranty()
    {
        if (2023 - fabricationYear <= 5)
        {
            return true;
        }
        return false;
    }
}
