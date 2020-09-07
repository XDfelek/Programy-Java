import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("http://sdacademy.pl/", "https://sdacademy.pl/");
    }

    @Test
    public void testSolution2() {
        runTest("https://sdacademy.pl/", "https://sdacademy.pl/");
    }

    @Test
    public void testSolution3() {
        runTest("http://http://sdacademy.pl/", "https://http://sdacademy.pl/");
    }

}