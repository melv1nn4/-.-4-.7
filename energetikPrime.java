import java.util.Scanner;
public class energetikPrime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");

        int Cif = scan.nextInt();

        for (int i = 2; i <= Cif; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // выводим если чило простое
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}