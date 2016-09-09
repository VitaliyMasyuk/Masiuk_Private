package ua.epam;

/**
 * Created by Vitalii_Masiuk on 9/9/2016.
 */
public class getCount {

    public static int getCount(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }
}
