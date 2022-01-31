package day01_JavaIntro;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {

        int[] arr = new int[100];


        int j = 0;
        for (int i = 100; i >=1 ; i--) {
            arr[j++] = i;
        }

        System.out.println(Arrays.toString(arr));
    }

}
