package SS3_Arrays_and_methods_in_Java.Practice;

public class StringToInt {
    public static void main(String[] args) {

        // 1 way: Use Integer.parseInt() to Convert a String to an Integer
        String str = "25";
        try{
            int number = Integer.parseInt(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        // 2 way: Use Integer.valueOf() to Convert a String to an Integer
        //String str = "25";
        try{
            Integer number = Integer.valueOf(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        // Simple method for checking whether the passed-in string is numeric or not? using method isNumberic().
        String str3 = "25a";
        String str4 = "25.06";
        System.out.println(isNumeric(str3));
        System.out.println(isNumeric(str4));
    }

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
