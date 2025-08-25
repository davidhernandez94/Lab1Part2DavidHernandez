package com.mycompany.lab1davidhernandez;

import java.lang.Math;

/**
 * @author David Hernandez 6309110
 * Lab 1
 * 25/08/2025
 */

public class ZipCode {
    protected int Zip;

    public ZipCode(int num) {
        Zip = num;
        if (Zip > 99_999) {
            System.out.println("Error: bar code must be 5 digits "
                    + "long or less");
        }
        Zip = Zip % 100_000;
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
        String zipString = String.valueOf(Zip);
        while (zipString.length() < 5) {
            zipString = " " + zipString;
        }
        for (int i = 0; i < zipString.length(); i++) {
            str += switch(zipString.charAt(i)) {
                case '1' -> "00011";
                case '2' -> "00101";
                case '3' -> "00110";
                case '4' -> "01001";
                case '5' -> "01010";
                case '6' -> "01100";
                case '7' -> "10001";
                case '8' -> "10010";
                case '9' -> "10100";
                default -> "11000";
            };
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
            String num = binary.substring(5 * i + 1, 5 * i + 6);
            result += (int) (switch(num) {
                            case "00011" -> 1;
                            case "00101" -> 2;
                            case "00110" -> 3;
                            case "01001" -> 4;
                            case "01010" -> 5;
                            case "01100" -> 6;
                            case "10001" -> 7;
                            case "10010" -> 8;
                            case "10100" -> 9;
                            default -> 0;
                        } * Math.pow(10, 4 - i));
        }
        return result;
    }
}
