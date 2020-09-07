public class zad4 {
    //4. Napisz program, który ilość wystąpień litery `r` oraz `t` w wyrazie `priorytetowy`.
    public static void main(String[] args) {
        String wyraz = "priorytetowy";
        char[] tablica = wyraz.toCharArray();
        int suma=0;
        for (int i=0;i<tablica.length;i++){
            if (tablica[i] == 'r'||tablica[i]=='t'){
                suma=suma+1;
            }
        }
        System.out.println(suma);
    }
}
