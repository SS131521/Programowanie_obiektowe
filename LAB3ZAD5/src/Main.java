import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj ciąg znaków: ");
        String str = scanner.nextLine();
        boolean x = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                x = false;
            }
        }
        if (x) {
            System.out.println("te słowo jest palindromem");
        } else {
            System.out.println("te słowo nie jest palindomem");
        }
    }
}