import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    public void testMultiplication() {
        Money dollar = Money.dollar(5);
        assertEquals(Money.dollar(10), dollar.times(2));
        assertEquals(Money.dollar(15), dollar.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).getCurrency());
    }

    @Test
    public void testDifferentClassEquality() {
        assertEquals(new Money(10, "USD"), new Dollar(10, "USD"));
    }

}