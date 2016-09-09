package ua.epam;

public class Main {

    public static void main(String[] args) {
        double a=8.5;
        double b=11.45;
        int c=10;
        double d=Math.abs (c-a);
        double e=Math.abs (c-b);
        if(d==e){
            System.out.println("Numbers are equal to number " +c);
        }
        if(d>e){
            System.out.println("Number " +b+ " closer to " +c);
        }
        if(d<e){
            System.out.println("Number " +a+ " closer to " +c);
        }
    }
}

