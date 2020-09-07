import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("24\n7", "3");
    }

    @Test
    public void testSolution2() {
        runTest("7\n24", "3");
    }

    @Test
    public void testSolution3() {
        runTest("3\n9", "0");
    }

    @Test
    public void testSolution4() {
        runTest("9\n3", "0");
    }

    @Test
    public void testSolution6() {
        runTest("20\n20", "0");
    }
}