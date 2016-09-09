package ua.epam;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vitalii_Masiuk on 9/7/2016.
 */
public class GetValueTest {
    @Test
    public void getValueFromIndex() throws Exception {
        int index = 4;
        int [] array = {2, 3, 5, 6, 7};


               GetValue getValue = new GetValue();

        int result = getValue.getValueFromIndex(index, array);
        assertEquals(7,result);

        System.out.println(result);
    }

}