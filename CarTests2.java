import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTests2 {
    @Test
    public void testHasWarranty()
    {
        Car car = new Car("Audi", 2020, 1235.67);

        assertTrue(car.hasWarranty());
    }
}
