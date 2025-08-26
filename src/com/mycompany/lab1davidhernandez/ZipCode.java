package com.mycompany.lab1davidhernandez;

import java.lang.Math;
import java.util.Arrays;

/**
 * @author David Hernandez 6309110
 * repository https://github.com/davidhernandez94/Lab1DavidHernandez
 * Lab 1
 * 25/08/2025
 */

public class ZipCode {
    protected int Zip;
    private final static String[] nums = {"11000","00011", "00101", "00110", "01001", "01010", "01100", "10001", "10010", "10100"};

    public ZipCode(int num) {
        Zip = num;
        if (Zip > 99_999) {
            System.out.println("Error: bar code must be 5 digits "
                    + "long or less");
        }
    }

    public ZipCode(String bar) {
        if (bar.length() != 27) {
            System.out.println("Error: bar code must be "
                    + "in multiples of 5-binary digits");
            return;
        }

        if (bar.charAt(0) != '1' || bar.charAt(26) != '1') {
            System.out.println("bar code missing a 1 at start or end");
            return;
        }

        boolean valid = true;
        for (int i = 0; i < 27; i++) {
            if (bar.charAt(i) != '0' && bar.charAt(i) != '1') {
                System.out.println("bar code character: " + bar.charAt(i)
                        + " must be '0' or '1'");
                valid = false;
            }
        }
        if (!valid) {
            return;
        }

        int counter;
        for (int i = 1; i <= 21; i += 5) {
            counter = 0;
            for (int j = i; j < i + 5; j++) {
                if (bar.charAt(j) == '1') {
                    counter++;
                }
            }
            if (counter != 2) {
                System.out.println(bar.substring(i, i + 5) + " has "
                        + "invalid sequence in the bar code");
            }
        }

        Zip = ParseBarCode(bar);
    }

    /**
     * calculates zip code as a string of binary digits
     * @return binary String
     */
    public String GetBarCode() {
        String str = "1";
        String zipString = String.valueOf(Zip % 100_000);
        while (zipString.length() < 5) {
            zipString = "0" + zipString;
        }
        for (int i = 0; i < zipString.length(); i++) {
            str += nums[Integer.parseInt(zipString.substring(i,i + 1))];
        }
        return str + "1";
    }

    /**
     * decodes the binary string
     * and returns the corresponding ZIP code as an integer
     * @return 5 digit integer zip code
     */
    private static int ParseBarCode(String binary) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += (int) (Arrays.asList(nums).indexOf(binary.substring(i * 5 + 1, i * 5 + 6)) * Math.pow(10, 4 - i));
        }
        return result;
    }
}
