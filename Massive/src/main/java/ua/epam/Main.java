package ua.epam;

import org.w3c.dom.css.Counter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {2, 5, 6, 4, 5, 7};
        int value = 5;
        boolean isvalue = false;
        System.out.println(Arrays.toString(array));
        isvalue = isvalue(array, value, isvalue);
        getCount cc = new getCount();



        if (isvalue) {
            System.out.println("Есть число");
            int count = cc.getCount(array, value);
            if(count==1) {
                System.out.println("Число присутствует 1 раз");
            }
            else {
                System.out.println("Число присутствует " +count+ " раз");
            }

            int [] arrayofindex = new int [count];
            int countofindex = 0;
            for (int i = 0; i < array.length; i++) {
                if (value == array [i]) {
                    arrayofindex[countofindex] = i;
                    countofindex++;
                }
            }
            System.out.println(Arrays.toString(arrayofindex));


        } else
            System.out.println("Нет числа!");
    }

    private static int getCount(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    private static boolean isvalue(int[] array, int value, boolean isvalue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                isvalue = true;
            }
        }
        return isvalue;
    }

        /*for (int i=0; i < array.length; i++) {
            if(array [i] == value) {

                System.out.println(i);
            isvalue = true;}


        }
        if(!isvalue) System.out.println("Нет числа");*/

}
