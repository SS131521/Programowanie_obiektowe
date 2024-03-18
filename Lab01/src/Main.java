import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Imie: " + imie("Sebastian"));
        System.out.println("wiek: " + wiek(21)); //1 zadanie
        double c;
        double d;
        double e;
        Scanner s = new Scanner(System.in);
        System.out.println("podaj wartosc c: ");
        c = s.nextDouble();
        System.out.println("podaj wartosc d: ");
        d = s.nextDouble();
        System.out.println("podaj wartosc e: ");
        e = s.nextDouble();
     int number=90;
     double a=3;
     double b=5;
     double liczba=40;
       kalkulator(a,b); //2 zadanie
       parzysta(number); //3
       podzielnosc(number); //4
       double wynikpotegi = potega(liczba); //5
        System.out.println("Liczba "+liczba+" podniesiona do potegi trzeciej to "+ wynikpotegi);
        double wynikpierwiastka = pierwiastek(liczba); //6
        System.out.println("pierwiastek z "+liczba+" to " + wynikpierwiastka);









    }


    public static String imie(String imie){return imie;}; //1 zadanie

    public static int wiek(int wiek){return wiek;};


    public static void kalkulator (double a, double b){
        System.out.println("suma" + a + "+" + b + " = " + (a+b));
        System.out.println("suma" + a + "+" + b + " = " + (a-b));
        System.out.println("suma" + a + "+" + b + " = " + (a*b));} //2 zadanie


    public static double InputDouble(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double liczba = input.nextDouble();
        return liczba;  }

    public static void parzysta(int number) {
    if(number % 2 == 0) {
        System.out.println("Liczba jest parzysta"); }
        else{
            System.out.println("Liczba jest nieparzysta");
        }
    }
    public static void podzielnosc(int number) {
        if(number % 5 == 0 && number % 3 ==0) {
            System.out.println("Liczba " + number + " jest podzielna przez 3 i 5"); }
        else{
            System.out.println("Liczba jest nieparzysta");
        }
    }

    public static double potega(double liczba){
    return Math.pow(liczba, 3);}

    public static double pierwiastek(double liczba){
        return Math.sqrt(liczba);}





    public static double zadanie7(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double liczba7 = input.nextDouble();
        return liczba7;  }





}



