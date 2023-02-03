// IMPORTANT: To read user input data, use the Scanner class,
// instantiating your scanner like this: "Scanner reader = new Scanner(System.in);".
// to print your outputs, use System.out.print or System.out.println.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

                boolean stop = false;

                Scanner scanner = new Scanner(System.in);
                int r = 0;
                int count = 0;

                int digitSum = 0;
                int lastValue = 0;
                boolean first = true;

                while (!stop) {
                        int v = scanner.nextInt();

                        if (first) {
                                r = v;
                                System.out.println("r: " + r);
                                count++;
                                first = false;
                        } else {
                                digitSum += getSumDigits(v);
                        }
                        
                        
                        stop = r < v;
                        
                        if (stop) {
                                count++;
                                lastValue = v;
                        }

                }

                System.out.println("count: " + count);
                System.out.println("Result: " + (count +  getSumDigits(lastValue)));
        }

        private static int getSumDigits(int value) {
                var strValue = Integer.toString(value);
                int sum = 0;

                for (var i = 0; i < strValue.length(); i++) {
                        int item = Character.getNumericValue(strValue.charAt(i));
                        sum += item;
                }

                return sum;

        }
}