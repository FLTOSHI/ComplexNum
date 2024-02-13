public class Main {
    public static void main(String[] args){
        Complex x = new Complex(2, 3);
        Complex y = new Complex(1, 2);

        Complex sum = x.add(x);
        Complex diff = x.subdivide(y);

        Complex firstResult = x.multiply(x);
        Complex secondResult = x.divide(y);

        System.out.println("Сумма двух комплексных чисел: " + sum);
        System.out.println("Разность двух комплексных чисел: " + diff);

        System.out.println("Результат умножения комплексных чисел: " + firstResult);
        System.out.println("Результат деления комплексных чисел: " + secondResult);

        System.out.println("Модуль комплексного числа x: " + x.getModule());
        System.out.println("Модуль комплексного числа y: " + y.getModule());

        if (x.isEqual(x)) {
            System.out.println("Комплексные числа явлюятся равными");
        } else {
            System.out.println("Комплексные числа не являются равными");

        }

    }
}