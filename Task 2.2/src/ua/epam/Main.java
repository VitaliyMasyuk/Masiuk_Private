package ua.epam;

public class Main {

    public static void main(String[] args) {
        int a = 522;
        int b = a%10;
        int c = (a/10)%10;
        int d = (a/100)%10;
        int Result = b+c+d;
        System.out.println("Summ ="+Result);
    }
}
