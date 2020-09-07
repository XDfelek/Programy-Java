import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("-1\n120", "");
    }

    @Test
    public void testSolution2() {
        runTest("0\n10001", "");
    }

    @Test
    public void testSolution3() {
        runTest("14\n21", "14\n21");
    }

    @Test
    public void testSolution4() {
        runTest("14\n14", "14");
    }

    @Test
    public void testSolution5() {
        runTest("13\n34", "14\n21\n28");
    }

    @Test
    public void testSolution6() {
        runTest("14\n36", "14\n21\n28\n35");
    }

    @Test
    public void testSolution7() {
        runTest("32\n33", "");
    }
}