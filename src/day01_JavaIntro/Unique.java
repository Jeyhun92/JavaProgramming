package day01_JavaIntro;

public class Unique {

    public static void main(String[] args) {
        
        String str = "aaabccddfghhh";// bfg
        
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            
            if (count==1){
                unique+= str.charAt(i) + "" + i;
            }
        }

        System.out.println("unique = " + unique);
        
        
    }
}
