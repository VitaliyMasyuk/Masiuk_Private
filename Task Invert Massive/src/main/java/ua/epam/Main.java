package ua.epam;

public class Main {


   public static void main(String[] args) {
        // write your code here
                 int ar[] = {1, 2, 3, 4, 5, 6, 7, 8};
            int len = ar.length;
            int k = len - 1;
            for (int i = 0; i < len / 2; i++) {

                int buf = ar[i];
                ar[i] = ar[k];
                ar[k] = buf;
                k--;
            }

            for (int i = 0; i < ar.length; i++) {
                System.out.println("a[" + i + "]" + ar[i]);
            }
    }
}


