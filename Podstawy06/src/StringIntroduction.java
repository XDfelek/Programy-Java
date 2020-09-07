public class StringIntroduction {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        boolean isEqual = s1 == s2;
        System.out.println("s1 == s2 " + isEqual);

        String s3 = new String("hello");
        boolean isEqualBad = s1 == s3;     // BAD!!!!!!!
        System.out.println("isEqualBad = " + isEqualBad);


        boolean isEqualCorrect = s1.equals(s3);
        System.out.println("isEqualCorrect = " + isEqualCorrect);
    }
}
