import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Complex {
    private int x;
    private int y;
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double sumReal = real + other.real;
        double sumImaginary = imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }
    public Complex subdivide(Complex other) {
        double diffReal = real - other.real;
        double diffImaginary = imaginary - other.imaginary;
        return new Complex(diffReal, diffImaginary);
    }

    public Complex multiply(Complex other) {
        double mulReal = (real * other.real) - (imaginary * other.imaginary);
        double mulImaginary = (real * other.imaginary) + (imaginary * other.real);
        return new Complex(mulReal, mulImaginary);
    }
    public Complex divide(Complex other) {
        double divReal = (real / other.real) - (imaginary / other.imaginary);
        double divImaginary = (real / other.imaginary) + (imaginary / other.real);
        return new Complex(divReal, divImaginary);
    }

    public double getModule() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public boolean isEqual(Complex other) {
        return (this.real == other.real) && (this.imaginary == other.imaginary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return x == complex.x && y == complex.y && Double.compare(complex.real, real) == 0 && Double.compare(complex.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, real, imaginary);
    }

    @Override
    public String toString() {
        return "Вещественное: " + real +
                ", Мнимое: " + imaginary;
    }
}