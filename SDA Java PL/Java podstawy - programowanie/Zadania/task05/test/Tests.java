import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTestForFloats("1.4", 1, 1, 2);
    }

    @Test
    public void testSolution2() {
        runTestForFloats("1.5", 1, 2, 2);
    }

    @Test
    public void testSolution3() {
        runTestForFloats("1.6", 1, 2, 2);
    }
}