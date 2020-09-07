import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("2020-05-02", "2020-05-08");
    }

    @Test
    public void testSolution2() {
        runTest("2020-05-22", "2020-05-22");
    }

    @Test
    public void testSolution3() {
        runTest("2020-12-31", "2021-01-01");
    }

}