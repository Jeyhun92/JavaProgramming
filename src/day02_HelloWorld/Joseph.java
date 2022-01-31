package day02_HelloWorld;

public class Joseph {
    public static void main(String[] args) {

        String str = "aaabbcdffgg";//abfg


        String result = "";
        for (int i = 0; i <str.length() ; i++) {//aaabbcdffgg
            if (!(result.contains(str.charAt(i) + ""))){
                int count = 0;

                for (int j = 0; j < str.length(); j++) { //aaabbcdffgg
                    if (str.charAt(i) == str.charAt(j)){
                        count++;

                    }
                }

                if (count>1){
                    result+= str.charAt(i);
                }


            }
        }

        System.out.println(result);

    }
    }

