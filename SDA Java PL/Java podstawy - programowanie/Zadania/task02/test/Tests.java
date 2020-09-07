import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("100", "true");
    }

    @Test
    public void testSolution2() {
        runTest("91", "true");
    }

    @Test
    public void testSolution3() {
        runTest("90", "true");
    }

    @Test
    public void testSolution4() {
        runTest("110", "true");
    }

    @Test
    public void testSolution5() {
        runTest("111", "false");
    }

    @Test
    public void testSolution6() {
        runTest("109", "true");
    }
}