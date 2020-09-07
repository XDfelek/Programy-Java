import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("kajak", "true");
    }

    @Test
    public void testSolution2() {
        runTest("Ka jak", "true");
    }

    @Test
    public void testSolution3() {
        runTest("abccba", "true");
    }

    @Test
    public void testSolution4() {
        runTest("ab bc", "false");
    }

    @Test
    public void testSolution5() {
        runTest("ab ca", "false");
    }

}