import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args){
        System.out.println("3.2-2.0 = " + (3.2 - 2.0));

        BigDecimal bigDecimal1 = null;
        BigDecimal bigDecimal2 = BigDecimal.TEN;

        BigDecimal bigDecimal3 = BigDecimal.valueOf(10001L);
        System.out.println("bigDecimal3 = " + bigDecimal3);

        BigDecimal bigDecimal4 = BigDecimal.valueOf(3.2);
        System.out.println("bigDecimal4 = " + bigDecimal4);

        BigDecimal bigDecimal5 = BigDecimal.valueOf(0.1);
        System.out.println("bigDecimal5 = " + bigDecimal5);

        BigDecimal bigDecimal6 = BigDecimal.valueOf(3.2 - 2.0);
        System.out.println("bigDecimal6 = " + bigDecimal6);

        BigDecimal bigDecimal7 = new BigDecimal("1.2345");
        System.out.println("bigDecimal7 = " + bigDecimal7);

        //NIE DZIALA
        //int i = bigDecimal6 + BigDecimal.ONE;

        BigDecimal bigDecimal8 = bigDecimal6.add(BigDecimal.TEN);
        System.out.println("bigDecimal8 = " + bigDecimal8);

        BigDecimal threePointTwo = new BigDecimal("3.2");
        BigDecimal twoDotZero = new BigDecimal("2.0");
        BigDecimal substract = threePointTwo.subtract(twoDotZero);
        System.out.println("substract = " + substract);

        BigDecimal bigDecimal9 = new BigDecimal();
    }
}
