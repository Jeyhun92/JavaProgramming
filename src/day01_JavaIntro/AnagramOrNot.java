package day01_JavaIntro;

import java.util.Arrays;
import java.util.Locale;

public class AnagramOrNot {

    public static void main(String[] args) {
        
        String str1 = "abcd".toLowerCase();
        String str2 = "DBCA".toLowerCase();


        
        char[] arr1 = str1.toCharArray();//{'a','b','c','d'}

        char[] arr2 = str2.toCharArray();//{'d','b','c','a'}

       Arrays.sort(arr1);
       Arrays.sort(arr2);
       
       
       boolean isAnagram = Arrays.equals(arr1, arr2);

        System.out.println("isAnagram = " + isAnagram);
    }
}
