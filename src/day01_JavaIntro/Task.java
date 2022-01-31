package day01_JavaIntro;

public class Task {

    public static void main(String[] args) {

        boolean ispalindrome=  isPalindrome(21141127);
        System.out.println(ispalindrome);
    }

    public static boolean isPalindrome(int num){
        int copy =num;
        int reversed=0;
        int remainder;

        while(num>0){
            remainder=num%10;//7

            reversed=(reversed*10)+remainder;
            num=num/10;
        }
        return reversed==copy;

    }

}
