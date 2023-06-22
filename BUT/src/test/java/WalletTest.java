import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WalletTest {
    private Wallet wallet;
    
    @Before
    public void setUp() {
        wallet = new Wallet();
    }
    
    @Test
    public void testDeposit() {
        wallet.deposit(100.0);
        assertEquals(100.0, wallet.getBalance(), 0.001);
    }
    
    @Test
    public void testSpendSufficientBalance() {
        wallet.deposit(100.0);
        wallet.spend(50.0);
        assertEquals(50.0, wallet.getBalance(), 0.001);
    }
    
    @Test
    public void testSpendInsufficientBalance() {
        wallet.spend(50.0);
    }
}