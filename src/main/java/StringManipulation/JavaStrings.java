package StringManipulation;

import java.util.Locale;

public class JavaStrings {
    public static void main(String[] args) {
        //string methods
        String str="Hemanth, HemanthS, HemanthSahukari";
        int len=str.length();
        System.out.println("Length of str is: "+len);
        System.out.println(str.charAt(0)+"|"+str.charAt(len-1));

        //toUpperCase
        String s1=str.toUpperCase();
        System.out.println("Str after uppercase is: "+str);
        System.out.println("s1 is: "+s1);

        //contains method
        if(str.contains("Hemanth")){
            System.out.println("Hemanth is in the string");
        }else
            System.out.println("it is not available in the string");
        //substring methods
        String s2= str.substring(8);
        System.out.println("s2 is: "+s2);
        String s3=str.substring(8, 16);
        System.out.println("s3 is: "+s3);
        //replace
        String s4=str.replace('H','N');
        System.out.println("s4 is: "+s4);
        //get all the characters from the string with spaces
        char[] charArr=str.toCharArray();
        for(char ch: charArr){
            System.out.print(ch+" ");
        }
        //pull all the names from the string
        String[] strArr=str.split(" , ");
        for(String s: strArr){
            System.out.println(s.trim());
        }
        //concatenates the string
        String s5=str.concat(" , HeMaNtH , hEmAnTh");
        System.out.println("s5 is: "+s5);

        //Compare another string without matching the case
        boolean s6= str.equalsIgnoreCase("HEMANTH");
        System.out.println("s6 is: "+s6);

    }

}
