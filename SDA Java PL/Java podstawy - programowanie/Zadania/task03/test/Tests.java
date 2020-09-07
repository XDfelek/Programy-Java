import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("-1\n1", "true");
    }

    @Test
    public void testSolution2() {
        runTest("0\n1", "false");
    }

    @Test
    public void testSolution3() {
        runTest("1\n0", "false");
    }

    @Test
    public void testSolution4() {
        runTest("1\n1", "false");
    }

    @Test
    public void testSolution5() {
        runTest("-1\n-1", "false");
    }
}