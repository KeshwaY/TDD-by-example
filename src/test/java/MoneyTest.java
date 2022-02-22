import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void compareDollarWithFranc() {
        assertNotEquals(new Dollar(5), new Franc(5));
    }

}