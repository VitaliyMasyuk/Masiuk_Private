package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int min =100;
        int max =999;
        int random = (int) (min + Math.random()*(max-min));
        int a=random%10;
        int b=(random/10)%10;
        int c=(random/100)%10;
        System.out.println("Number is " +random+ " and Max number is " +Math.max(a, Math.max(b,c)));


    }

}


