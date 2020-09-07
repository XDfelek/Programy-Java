import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("21\n24", "3");
    }

    @Test
    public void testSolution2() {
        runTest("16\n25", "1");
    }

    @Test
    public void testSolution3() {
        runTest("1\n100", "1");
    }

    @Test
    public void testSolution4() {
        runTest("17\n17", "17");
    }

}