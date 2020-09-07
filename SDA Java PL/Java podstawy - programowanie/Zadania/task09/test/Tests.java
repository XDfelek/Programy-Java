import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("1", "*\n#");
    }

    @Test
    public void testSolution2() {
        runTest("3", "  *\n ***\n*****\n  #");
    }

    @Test
    public void testSolution3() {
        runTest("4", "   *\n  ***\n *****\n*******\n   #");
    }

}