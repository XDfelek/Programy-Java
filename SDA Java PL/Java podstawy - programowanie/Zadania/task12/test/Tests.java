import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("Znowu sie nie kompiluje, motyla noga!", "Znowu sie nie kompiluje, ***!");
    }

    @Test
    public void testSolution2() {
        runTest("Tu nie ma przeklenstw", "Tu nie ma przeklenstw");
    }

    @Test
    public void testSolution3() {
        runTest("kurka wodna kurka wodna", "*** ***");
    }

    @Test
    public void testSolution4() {
        runTest("psiakrew kurka wodna motyla noga", "*** *** ***");
    }

}