import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("abc", "ABC");
    }

    @Test
    public void testSolution2() {
        runTest("abcd", "aBCD");
    }

    @Test
    public void testSolution3() {
        runTest("ok", "OK");
    }

    @Test
    public void testSolution4() {
        runTest("Ala ma kota", "Ala ma kOTA");
    }

    @Test
    public void testSolution5() {
        runTest("Czy Ala ma kota???", "Czy Ala ma kota???");
    }

}