public class JavaBasic {

    public static void main(String[] args){

        String str = "This is very easy programme"; // remove all occurrences of character'c' from string

        System.out.println(str.replaceAll("[s]",""));

        String Str1 = "This is very easy programme";// find out length of string

        int length = str.length();
        System.out.println(length);

        String str2 = "This is very easy programme"; // extract space from string
        System.out.println(str2.replaceAll("\\s",""));

        String str3 = "This $300 is equivalent of £200 but not for @100"; // extract special character from string
        System.out.println(str3.replaceAll("[$£@]",""));

        String str4 = "The cost of iphone is £1250"; // extract number from string
        System.out.println(str4.replaceAll("\\D", ""));

        int i = 450;   // convert integer to double
        double d2 = i;
        System.out.println(d2);


        double d =123.45; // convert double into string
        String s = Double.toString(d);
        System.out.println(d);

        String num1 = "560.25"; // convert string into double
        double d1 = Double.parseDouble(num1);
        System.out.println(d1);

        String value = "125"; // convert string into integer

        int c = Integer.parseInt(value);
        System.out.println(c);


        String s1 = "$250.00"; // replace currency symbol from $ to £ in string
        System.out.println(s1.replaceAll("\\$","£"));

    }




        }



