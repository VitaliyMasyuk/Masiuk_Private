package ua.epam;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created by Vitalii_Masiuk on 9/9/2016.
 */
public class getCountTest {
    @Test
    public void getCount() throws Exception {
        int[] arr_test = {};
        int value = 1;
        getCount cc = new getCount();
        int count = cc.getCount(arr_test, value);
        Assert.assertEquals(0, count);
    }

}