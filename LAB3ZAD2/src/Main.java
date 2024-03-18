import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        double sumaDod = 0;
        double sumaUj = 0;
        int ujemne = 0;
        int dodatnie = 0;
        int n = 10;
        for (int i = 0; n > i; i++) {
            System.out.print("podaj liczbe: ");
            double temp = scanner.nextDouble();
            suma += temp;
            if (temp > 0) {
                dodatnie++;
                sumaDod += temp;
            } else if (temp < 0) {
                ujemne++;
                sumaUj += temp;
            }
        }
        System.out.println("dodatnie: " + dodatnie + " suma dodatnie: " + sumaDod + " ujemne: " + ujemne + " suma ujemne: " + sumaUj + " suma razem: " + suma);
    }
}