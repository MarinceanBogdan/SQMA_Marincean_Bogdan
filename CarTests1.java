import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTests1 {
    @Test
    public void testConstructorWorksCorrectlyForBrand()
    {
        String brand = "Audi";
        Car car = new Car(brand, 2020, 1235.67);

        assertEquals(brand, car.getBrand());
    }
}
