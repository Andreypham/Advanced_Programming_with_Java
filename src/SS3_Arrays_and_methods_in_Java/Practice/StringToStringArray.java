package SS3_Arrays_and_methods_in_Java.Practice;

import java.util.regex.Pattern;

public class StringToStringArray {
    public static void main(String[] args) {
        //1st way
        //declaring and initializing a string
        String str = "Converting string to string array using split() method";
        //declaring an empty string array
        String[] strArray = null;
        //converting using String.split() method with whitespace as a delimiter
        strArray = str.split(" ");
        //printing the converted string array
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        //2nd way
        String commaSeparatedStr = "Hello,have,a,nice,day";
        String[] strArray1 = null;    //empty string array
        // converting using String.split() method with comma as a delimiter
        strArray1 = commaSeparatedStr.split(",");
        //printing the converted string array
        for (int i = 0; i< strArray1.length; i++){
            System.out.println(strArray1[i]);
        }

        //3rd way
        //declaring and initializing a string
        String str1 = "Converting string to string array using Pattern.split()";
        //declaring an empty string arr1ay
        String[] strArray2 = null;
        //parsing white space as a parameter
        Pattern ptr = Pattern.compile(" ");
        //storing the string elements in array after splitting
        strArray2 = ptr.split(str);
        //printing the converted string array
        for (int i = 0; i< strArray2.length; i++){
            System.out.println(strArray2[i]);
        }

        //4th way
        //declaring and initializing a string with a separator
        String str3 = "Hello #a1Ben #a1how #a1are #a1you ?";
        //declaring an empty string array
        String[] strArray3 = null;
        //splitting the string with delimiter as #a1
        String patternStr3 = "#a1";
        Pattern ptr3 = Pattern.compile(patternStr3);
        //storing the string elements in array after splitting
        strArray3 = ptr3.split(str3);
        //printing the converted string array
        for (int i = 0; i< strArray3.length; i++){
            System.out.println(strArray3[i]);
        }
    }
}
