import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("-6", "-6 -5 -4 -3 -2 -1 0");
    }

    @Test
    public void testSolution2() {
        runTest("3", "3 2 1 0");
    }

    @Test
    public void testSolution3() {
        runTest("0", "0");
    }
}