import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by Han on 14/06/16.
 */
public class AddFracrionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0,sum.intValue());

    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(3).plus(new Fraction(0));

        assertEquals(3, sum.intValue());

    }
}
