package ua.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=9,b=-10,c=-5;
        System.out.println("Numbers a, b и c: "+a+" "+b+" "+c);
        if(a<b&a<c){
            if(b<c)System.out.println("Increase sequence "+a+" "+b+" "+c);
            else System.out.println("Increase sequence "+a+" "+c+" "+b);
        }
        if(b<a&b<c){
            if(a<c)System.out.println("Increase sequence "+b+" "+a+" "+c);
            else System.out.println("Increase sequence "+b+" "+c+" "+a);
        }
        if(c<a&c<b){
            if(a<b)System.out.println("Increase sequence "+c+" "+a+" "+b);
            else System.out.println("Increase sequence "+c+" "+b+" "+a);
        }
    }
}
