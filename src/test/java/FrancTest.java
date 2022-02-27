import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrancTest {

    @Test
    public void testMultiplication() {
        Money franc = Money.franc(5);
        assertEquals(Money.franc(10), franc.times(2));
        assertEquals(Money.franc(15), franc.times(3));
    }

    @Test
    public void testCurrency() {
        assertEquals("CHF", Money.franc(1).getCurrency());
    }

}