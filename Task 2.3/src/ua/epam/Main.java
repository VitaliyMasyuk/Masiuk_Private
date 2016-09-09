package ua.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b = a % 10;
        int c = a / 10 % 10;
        int Result = b + c;
        System.out.println("Summ =" + Result);
    }
}
