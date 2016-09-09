package ua.epam;

import java.util.Arrays;

/**
 * Created by Vitalii_Masiuk on 9/7/2016.
 */
public class GetValue {
    public int getValueFromIndex(int index, int[] array) {
        int result = array[index];
        System.out.println(Arrays.toString(array));
        System.out.println(index);
        return result;
    }
}
