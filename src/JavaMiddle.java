import java.util.Scanner;

public class JavaMiddle {

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in); // string input = "There" odd number so output should be "e"
        System.out.print("Enter a String: ");// string input = "England" odd number so output should be "l"
        String string = in.next();

        int position;
        int length;

        if (string.length() % 2 == 1) {     // string input = "orange" even number so output should be middle of two
            position = string.length() / 2;   // character "an"
            length = 1;

        }
            else{

                position = string.length() / 2 - 1;
                length = 2;
            }

            String results = string.substring(position, position + length);

            System.out.println("middle: " + results);


            Scanner sc = new Scanner(System.in);   // find out the answer 1/3 in decimal point
                                                    //

            System.out.println("Enter Numerator : ");
            int numerator = sc.nextInt();
            System.out.println("Enter Denominator: ");
            int denominator = sc.nextInt();
            if (denominator == 0) {

                System.out.println("Cant divide by zero");

            }


            else {

                double fraction = (double)numerator / denominator;
                System.out.println(fraction);


            }


        }

    }

