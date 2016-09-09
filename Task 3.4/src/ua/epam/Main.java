package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = (int) (Math.random()*150)+5;
        if(a<=25&&a>=100){

            System.out.println("Number "+a+" isn't in interval (25,100)");

        }

        else {

            System.out.println("Number "+a+" is in interval (25,100)");

        }

    }
}
