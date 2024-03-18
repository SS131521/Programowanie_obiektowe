import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = {1, 3, 3, 6, 3, 2};
        int suma = 0;
        for (int i = 0; i < 6; i++) {
            if (tab[i] % 2 == 0) {
                suma += tab[i];
            }
        }
        System.out.println("suma: " + suma);
        System.out.print("podaj n: ");
        int n = scanner.nextInt();
        suma = 0;
        for (int i = 0; i < n; i++) {
            int temp = (int) ((Math.random() * (45 - (-10))) + (-10));
            if (temp % 2 == 0) {
                suma += temp;
            }
        }
        System.out.println("suma: " + suma);
    }
}