// IMPORTANT: To read user input data, use the Scanner class,
// instantiating your scanner like this: "Scanner reader = new Scanner(System.in);".
// to print your outputs, use System.out.print or System.out.println.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int mult = 0;
        int sum = 0;

        var stringDigits = Integer.toString(num);

        for (var i = 0; i < stringDigits.length(); i++) {
            int item = Character.getNumericValue(stringDigits.charAt(i));
            if (mult != 0) {
                mult *= item;
            } else {
                mult = item;
            }
            sum += item;
        }

        System.out.println(mult - sum);
    }
}