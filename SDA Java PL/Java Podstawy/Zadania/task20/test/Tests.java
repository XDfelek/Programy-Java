import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
    @Test
    public void testSolution() {
        String dateA = "2014::01::23";
        String dateB = "03--2020-30";
        int[] expected = new int[]{6, 2, 7};

        int[] result = Task.calculateDifference(dateA, dateB);

        assertArrayEquals(String.format("Dla dat %s oraz %s metoda powinna zwrócić tablicę: %s.", dateA, dateB, Arrays.toString(expected)), expected, result);
    }

    @Test
    public void testSolution2() {
        String dateA = "2013::06::01";
        String dateB = "06--2120-01";
        int[] expected = new int[]{107, 0, 0};

        int[] result = Task.calculateDifference(dateA, dateB);

        assertArrayEquals(String.format("Dla dat %s oraz %s metoda powinna zwrócić tablicę: %s.", dateA, dateB, Arrays.toString(expected)), expected, result);
    }
}