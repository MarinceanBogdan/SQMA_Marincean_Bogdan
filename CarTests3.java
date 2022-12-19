import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTests3 {
    @Test
    public void testIsExpensive()
    {
        Car car = new Car("Audi", 2020, 1235.67);

		assertTrue(car.getPrice() > 1000);
    }
}
