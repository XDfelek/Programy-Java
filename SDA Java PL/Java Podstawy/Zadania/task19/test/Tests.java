import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testSolution() {
        String pattern = "dd-MM-yyyy";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate date = LocalDate.of(2020, 3, 5);

        LocalDate result = Task.toLocalDate(pattern, date.format(dateTimeFormatter));

        assertEquals(String.format("Dla formatu %s oraz daty %s metoda powinna zwrócić poprawny obiekt.", pattern, date.format(dateTimeFormatter)), date, result);
    }

    @Test
    public void testSolution2() {
        String pattern = "MM-dd-yyyy";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate date = LocalDate.of(2021, 7, 5);

        LocalDate result = Task.toLocalDate(pattern, date.format(dateTimeFormatter));

        assertEquals(String.format("Dla formatu %s oraz daty %s metoda powinna zwrócić poprawny obiekt.", pattern, date.format(dateTimeFormatter)), date, result);
    }

    @Test
    public void testSolution3() {
        String pattern = "yyyy-MM-dd";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate date = LocalDate.of(2022, 3, 7);

        LocalDate result = Task.toLocalDate(pattern, date.format(dateTimeFormatter));

        assertEquals(String.format("Dla formatu %s oraz daty %s metoda powinna zwrócić poprawny obiekt.", pattern, date.format(dateTimeFormatter)), date, result);
    }

    @Test
    public void testSolution4() {
        String pattern = "yyyy::dd::MM";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate date = LocalDate.of(1980, 12, 9);

        LocalDate result = Task.toLocalDate(pattern, date.format(dateTimeFormatter));

        assertEquals(String.format("Dla formatu %s oraz daty %s metoda powinna zwrócić poprawny obiekt.", pattern, date.format(dateTimeFormatter)), date, result);
    }
}