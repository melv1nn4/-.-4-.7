import java.util.Scanner;

public class RevInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // число с которым будем проводить ревёрс
        System.out.print("введите целое: ");
        int number = scanner.nextInt();

        // Ревёрс числа
        int revNumber = 0;
        while (number != 0) {
            revNumber = revNumber * 10 + number % 10;
            number /= 10;
        }

        // ревёрс с 10 символами , заполненый нулями в начале
        System.out.printf("%010d\n", revNumber);
    }
}

