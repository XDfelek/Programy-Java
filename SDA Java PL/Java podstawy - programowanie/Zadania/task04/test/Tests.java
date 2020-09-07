import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("6", "true");
    }

    @Test
    public void testSolution2() {
        runTest("7", "true");
    }

    @Test
    public void testSolution3() {
        runTest("13", "false");
    }

    @Test
    public void testSolution4() {
        runTest("14", "true");
    }

    @Test
    public void testSolution5() {
        runTest("20", "false");
    }

    @Test
    public void testSolution6() {
        runTest("43", "false");
    }
}