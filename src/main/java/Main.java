public class Main {
    public static void main(String[] args){
        Complex x = new Complex(2.5, 3.7);
        Complex y = new Complex(1.8, 2.2);

        Complex sum = x.add(x);
        Complex diff = x.sub(y);

        Complex resultOne = x.mul(x);
        Complex resultTwo = x.div(y);

        System.out.println("Сумма двух комплексных чисел: " + sum);
        System.out.println("Разность двух комплексных чисел: " + diff);
        System.out.println("Результат умножения комплексных чисел: " + resultOne);
        System.out.println("Результат деления комплексных чисел: " + resultTwo);
        System.out.println("Модуль комплексного числа x: " + x.getModulus());
        System.out.println("Модуль комплексного числа y: " + y.getModulus());

        if (x.isEqual(x)) {
            System.out.println("Комплексные числа равны");
        } else {
            System.out.println("Комплексные числа не равны");

        }

    }
}