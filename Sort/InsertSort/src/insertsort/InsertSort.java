package insertsort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class InsertSort {
    public static void main(String a[]) {
        /* int[] array1 = {50,37,2,157,875,964,804,214}; */
        //GIT FUNGUJE

        int max = 1000;
        int top = 500;

        Date zacatek = new Date();

        int[] array1 = new int[max];
        for(int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()*top + 1);
        }
        System.out.println("Vygenerovana cisla: " + Arrays.toString(array1));


        int[] array2 = InsertSort(array1);
        for(int i:array2) {
            System.out.print(i);
            System.out.print(", ");
            /*System.out.println("  //DEBUG: Nacten array");*/
        }

        Date konec = new Date();
        long rozdil = konec.getTime() - zacatek.getTime();
        System.out.println(rozdil + " milisekund");

        System.out.println("Pole o délce " + max + " náhodných čísel a maximálním číslu " + top + " bylo seřazeno za " + rozdil + " milisekund");


  }
    public static int[] InsertSort(int[] input) {
        int temp;
        //System.out.println("//DEBUG: Zacatek trideni");
        for(int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--) {
                if(input[j] < input[j-1]) {
                temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
                    }
                }
            }
        return input;
    }
}

