import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // введение  значений a, b і x
        System.out.print("значение a: ");
        double a = scanner.nextDouble();

        System.out.print("значение b: ");
        double b = scanner.nextDouble();

        System.out.print("значение x: ");
        double x = scanner.nextDouble();

        double f;

        // оператор для проверки значения x
        if (x >= 1 && x < 3) {
            // по скольку x  [1, 3)
            f = 9 / (a * x);
        } else if (x == 3) {
            // если x = 3
            f = (a * Math.pow(x, 2)) + x + b;
        } else {
            // если x не попадает под какой либо случай
            System.out.println("недопустимое значение x.");
            return;
        }

        // результат
        System.out.println("значение f(x): " + f);
    }
}
