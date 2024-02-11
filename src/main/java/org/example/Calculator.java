package org.example;



import java.util.List;

public class Calculator {

    public double sum(List<? extends Number> array) {
        double result = 0.0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double div(List<? extends Number> array) {
        double result;
        if (!array.isEmpty()) {
            result = array.get(0).doubleValue();
        } else {
            return 0.0;
        }
        for (int i = 1; i < array.size(); i++) {
            result /= array.get(i).doubleValue();
        }
        return result;
    }

    public double multiply(List<? extends Number> array) {
        double result = 1.0;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    public int binaryToDecimal(int binary) {
        int result = 0;
        int digit;
        int baseOf2 = 1;
        while (binary > 0) {
            digit = binary % 10;
            result += digit * baseOf2;
            binary = binary / 10;
            baseOf2 = baseOf2 * 2;
        }

        return result;
    }

    public int binaryToDecimal(String binary) {
        return binaryToDecimal(Integer.parseInt(binary));
    }

    public String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        int remainder;
        while (decimal > 0) {
            remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }
        return binary.toString();
    }
}