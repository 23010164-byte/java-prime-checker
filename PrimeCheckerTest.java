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
@Test
void test4() {
    assertTrue(PrimeChecker.isPrime(2));
}

@Test
void test5() {
    assertFalse(PrimeChecker.isPrime(9));
}
}
