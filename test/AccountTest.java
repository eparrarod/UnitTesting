import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by USER on 03/07/16.
 *
 * @author Esteban
 */
public class AccountTest {

    @Test
    public void testDeposit() throws Exception {
        Account t = new Account();
        t.deposit((float)10);
        assertEquals((float)10, t.getBalance(),0.1);
    }

    @Test
    public void testWithdraw() throws Exception {
        Account t = new Account(10,5);
        t.withdraw((float)10);
        assertEquals((float)5, t.getBalance(),0.1);
    }

    @Test
    public void testTransferFunds() throws Exception {
        fail("Not yet implemented");
    }
}