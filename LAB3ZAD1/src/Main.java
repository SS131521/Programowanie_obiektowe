import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe studentow: ");
        int n = scanner.nextInt();
        int i = 0;
        int suma = 0;
        while (n > i){
            System.out.printf("podaj punky %d studenta: ",i+1);
            suma += scanner.nextInt();
            i++;
        }
        double srednia = (double) suma / n;
        System.out.println("srednia pkt studnentow: "+srednia);
    }
}