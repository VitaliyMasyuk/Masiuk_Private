package ua.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else System.out.println("Uneven");
    }
        }
