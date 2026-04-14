import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {

    @Test
    void test1() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    void test2() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    void test3() {
        assertFalse(PrimeChecker.isPrime(8));
    }
}
