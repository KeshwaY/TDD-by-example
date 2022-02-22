import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar dollar = new Dollar(5);
        assertEquals(new Dollar(10), dollar.times(2));
        assertEquals(new Dollar(15), dollar.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
    }

}