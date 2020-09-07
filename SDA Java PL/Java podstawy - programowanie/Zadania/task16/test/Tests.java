import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("1", "1");
    }

    @Test
    public void testSolution2() {
        runTest("5", "120");
    }

    @Test
    public void testSolution3() {
        runTest("9", "362880");
    }

}