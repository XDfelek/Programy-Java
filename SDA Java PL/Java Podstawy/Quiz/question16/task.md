W których linijkach kodu słowo static jest użyte prawidłowo?

```java
public class A {
    static int x = 5;

    public static A() {
        static int y = 8;
    }
    
    public static void B() {
        int z = 11;
    }
}
```