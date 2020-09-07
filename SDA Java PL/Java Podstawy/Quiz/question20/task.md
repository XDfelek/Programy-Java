Jaki będzie rezultat wykonania następującego programu?

```java
import java.time.LocalDate;

public class A {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2020, 3, 31);
        d.plusDays(1);
        System.out.println(d);
    }
}
```