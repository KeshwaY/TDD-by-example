import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrancTest {

    @Test
    public void testMultiplication() {
        Franc franc = new Franc(5);
        assertEquals(new Franc(10), franc.times(2));
        assertEquals(new Franc(15), franc.times(3));
    }


}