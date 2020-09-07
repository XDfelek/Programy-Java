package oop;

import java.util.Arrays;

public class VarargsExample {

    //public int sum(int[] liczby){
    public int sum(int... liczby){         // trzy kropki robia z tego tablice
        int suma = 0;
        System.out.println("liczby = " + Arrays.toString(liczby));

        for (int liczba:liczby){
            suma += liczba;
        }

        return suma;

    }
    public int minMax (int... liczby){
        System.out.println("liczby = " + Arrays.toString(liczby));
        int max = liczby[0];
        int min = liczby[0];
        for (int i = 0; i< liczby.length; i++){
            if (liczby[i] <= min){
                min = liczby[i];
            }
            if (liczby[i] >= max){
                max = liczby[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        return 0;
    }
    public int min (int... liczby){
        int min = liczby[0];
        for (int i = 0; i< liczby.length; i++){
            if(liczby[i]<=min){
                min = liczby[i];
            }
        }
        return min;
    }
    public int max (int... liczby){
        int max = liczby[0];
        for(int i = 0; i< liczby.length; i++){
            if(liczby[i]>=max){
                max = liczby[i];
            }
        }
        return max;
    }




}


