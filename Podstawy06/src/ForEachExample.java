import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        char[] charTable = {'a', 'b', 'c', 'd', 'e'};
        boolean[] boolTable = new boolean[7];
        double[] doubleTable = new double[11];
        int[][] multiIntTable = new int[3][8];

        for (int i = 0; i < charTable.length; ++i) {
            System.out.println("char[" + i + "] = " + charTable[i]);
        }

        for (char charValue : charTable) {
            System.out.println("For-each char: " + charValue);
        }

        for (boolean boolValue : boolTable) {
            System.out.println("For-each bool: " + boolValue);
        }
        for (double doubleValue : doubleTable) {
            System.out.println("For-each double: " + doubleValue);
        }

        for (int[] insideTable : multiIntTable){
            for (int insideValue : insideTable){
                System.out.println("insideValue = " + insideValue);
            }
            System.out.println("insideTable = " + Arrays.toString(insideTable));
        }

    }
}
