package day01_JavaIntro;

public class Unique2 {
    public static void main(String[] args) {
        
        String str = "aaabccddfghhh";// bfg

        String unique = "";
        for (int i = 0; i <str.length() ; i++) {
            
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                unique+= str.charAt(i) + "" + i;
                
            }
        }

        System.out.println("unique = " + unique);
        
        
        
        
        
        
    }
    
}
