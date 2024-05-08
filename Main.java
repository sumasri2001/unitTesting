package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(toUppercase("Sai Suma Sri Addala"));
        System.out.println(tc1singlechar());
        System.out.println(tc2emptystring());
        System.out.println(tc3specialchar());
        System.out.println(tc4charwithnum());
        System.out.println(tc5withonelowercase());
        System.out.println(tc6MixedInput());
        System.out.println(tc7spaces());
        System.out.println(tc8spaces());
//        System.out.println(tc9NullInput());
    }
    public static String toUppercase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }

    //Test case checking for single character
    public static boolean tc1singlechar() {
        String expected = "A";
        String input = "a";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Test case checking for empty input
    public static boolean tc2emptystring() {
        String expected = "";
        String input = "";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Test case checking for character with special charcters
    public static boolean tc3specialchar(){
        String expected = "@!";
        String input = "@!";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Test case checking for character with numbers.
    public static boolean tc4charwithnum() {
        String expected = "SUMASRI122";
        String input = "Sumasri122";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Test case checking for character with one lowercase
    public static boolean tc5withonelowercase(){
        String expected = "SAISUMA2";
        String input = "SaISUMA2";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Test case checking for character with mixed input
    public static boolean tc6MixedInput() {
        String expected = "SAISUMA2@SRI ADDALA";
        String input = "SaiSuma2@Sri Addala";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //test case checking for character with spaces in between
    public static boolean tc7spaces(){
        String expected = "S U M A S R I @ 1 2 2";
        String input = "S u m a s r i @ 1 2 2";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //test case for character with spaces at start and end
    public static boolean tc8spaces(){
        String expected = "  SUMASRI@122  ";
        String input = "  sumasri@122  ";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //test case for null as input
    public static boolean tc9NullInput() {
        String expected = null;
        String input = null;
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

}