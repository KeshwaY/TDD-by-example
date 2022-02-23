import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void compareDollarWithFranc() {
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

}