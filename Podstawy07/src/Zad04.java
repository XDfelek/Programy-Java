public class Zad04 {
    public static void main(String[] args) {
        int iloscWystapienR=0;
        int iloscWystapienT=0;
        String text = "prioretytowy";
        char[] textChar = text.toCharArray();
        for (int i = 0; i< textChar.length; i++){
            if (textChar[i] == 'r'){
                iloscWystapienR++;
            }else if (textChar[i] == 't'){
                iloscWystapienT++;
            }
        }
        System.out.println("iloscWystapienR = " + iloscWystapienR);
        System.out.println("iloscWystapienT = " + iloscWystapienT);
    }
}
