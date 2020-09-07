public class VariableScope {
    public static void main(String[] args) {
        int x = 97;
       for (int i = 0; i<= 20; i++) {
           char d = (char) x;
           System.out.println(d);
           x++;
       }
    }
}
