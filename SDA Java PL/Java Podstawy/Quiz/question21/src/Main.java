public class Main {
    private static int a;

    public static void main(String[] args) {
        int a = 5;
        System.out.println(f(a));
        System.out.println(f(a));
        System.out.println(a);
    }
    static public int f(int x){
        a++;
        return a+x;
    }
}