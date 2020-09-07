import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Tests extends BaseTest {

    private String printAsString(int... ints) {
        return Arrays.stream(ints)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("\n"));
    }

    @Test
    public void testSolution() {
        runTest(printAsString(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), "");
    }

    @Test
    public void testSolution2() {
        runTest(printAsString(1, 2, 3, 4, 5, 1, 2, 3, 4, 5), "1\n2\n3\n4\n5");
    }

    @Test
    public void testSolution3() {
        runTest(printAsString(1, 2, 3, 4, 5, 5, 4, 3, 2, 1), "1\n2\n3\n4\n5");
    }

    @Test
    public void testSolution4() {
        runTest(printAsString(1, 2, 3, 4, 5, 8, 11, 2, 5, 9), "2\n5");
    }

}