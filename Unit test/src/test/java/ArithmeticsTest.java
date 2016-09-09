import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vitalii_Masiuk on 9/7/2016.
 */
public class ArithmeticsTest {
    @Test
    public void add() throws Exception {
    Arithmetics a = new Arithmetics();
        double b = a.add(3,7);
    if(b != 10) Assert.fail();
    }

    @Test
    public void deduct() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.deduct(3,7);
        if(res != -4) Assert.fail();
    }


    @Test
    public void mult() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.mult(3,7);
        if(res != 21) Assert.fail();
    }

    @Test
    public void div() throws Exception {
        Arithmetics a = new Arithmetics();
        double res = a.div(10,5);
        if(res != 2) Assert.fail();
    }

}