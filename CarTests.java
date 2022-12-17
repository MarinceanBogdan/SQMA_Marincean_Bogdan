package tests;

import classes.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTests {

    @Test
    public void testConstructorWorksCorrectlyForBrand()
    {
        String brand = "Audi";
        Car car = new Car(brand, 2020, 1235.67);

        assertEquals(brand, car.getBrand());
    }

    @Test
    public void testSetterForBrand()
    {
        Car car = new Car("Audi", 2020, 1235.67);
        String brand = "Hyundai";
        car.setBrand(brand);

        assertEquals(brand, car.getBrand());
    }

    @Test
    public void testHasWarranty()
    {
        Car car = new Car("Audi", 2020, 1235.67);

        assertTrue(car.hasWarranty());
    }
}
