import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void add() {
        Complex complex = new Complex();
        Complex x = new Complex(2, 3);
        Complex y = new Complex(1, 2);
        Complex expected = new Complex(3, 5);
        Complex sum = x.add(y);
        assertEquals(expected, sum);

    }

    @Test
    void subdivide() {
        Complex complex = new Complex();
        Complex x = new Complex(2, 3);
        Complex y = new Complex(1, 2);
        Complex expected = new Complex(1, 1);
        Complex diff = x.subdivide(y);
        assertEquals(expected, diff);
    }

    @Test
    void multiply() {
        Complex complex = new Complex();
        Complex x = new Complex(5, 7);
        Complex y = new Complex(8, 2);
        Complex expected = new Complex(26, 66);
        Complex resultOne = x.multiply(y);
        assertEquals(expected, resultOne);
    }

    @Test
    void divide() {
        Complex complex = new Complex();
        Complex x = new Complex(2.5, 3.7);
        Complex y = new Complex(1.8, 2.2);
        Complex expected = new Complex(-0.2929292929292928, 3.191919191919192);
        Complex resultTwo = x.divide(y);
        Assertions.assertEquals(expected, resultTwo);
    }
}