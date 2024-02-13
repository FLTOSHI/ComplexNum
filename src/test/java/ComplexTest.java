import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void add() {
        Complex complex = new Complex();
        Complex x = new Complex(2.5, 3.7);
        Complex y = new Complex(1.8, 2.2);
        Complex expected = new Complex(4.3, 5.9);
        Complex sum = x.add(y);
        assertEquals(expected, sum);

    }

    @Test
    void subdivide() {
        Complex complex = new Complex();
        Complex x = new Complex(2.5, 3.7);
        Complex y = new Complex(1.8, 2.2);
        Complex expected = new Complex(0.7, 1.5);
        Complex diff = x.subdivide(y);
        assertEquals(expected, diff);
    }

    @Test
    void multiply() {
        Complex complex = new Complex();
        Complex x = new Complex(2.5, 3.7);
        Complex y = new Complex(1.8, 2.2);
        Complex expected = new Complex(-3.6400000000000006, 12.16);
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
        assertEquals(expected, resultTwo);

    }
}