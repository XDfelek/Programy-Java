import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTestReturningSingleFloat("100", 160);
    }

    @Test
    public void testSolution2() {
        runTestReturningSingleFloat("0", 0);
    }

    @Test
    public void testSolution3() {
        runTestReturningSingleFloat("50.83", 81.328f);
    }
}