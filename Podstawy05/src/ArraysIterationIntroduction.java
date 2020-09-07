public class ArraysIterationIntroduction {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < tab.length; i++){
            int value = tab[i];
            System.out.println("Forward = [" + value + "] = " + value);
        }
        for (int i = tab.length -1; i >=0 ; i--){
            int value = tab[i];
            System.out.println("Backward = [" + value + "] = " + value);
        }
    }
}
