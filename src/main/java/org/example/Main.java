package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        List<Integer> arrayInt = new ArrayList<>(Arrays.asList(100, 2, 5, 1));
        List<Double> arrayDouble = new ArrayList<>(Arrays.asList(36.4,7.0,5.2));

        System.out.println("Сумма массива целых чисел (arrayInt): " + calculator.sum(arrayInt));
        System.out.println("Произведение массива целых чисел (arrayInt): " + calculator.multiply(arrayInt));
        System.out.println("Деление первого элемента массива на остальные элемента массива (arrayInt): "
                + calculator.div(arrayInt));

        System.out.println("Сумма массива вещественных чисел (arrayDouble): " + calculator.sum(arrayDouble));
        System.out.println("Произведение массива вещественных чисел (arrayDouble): "
                + calculator.multiply(arrayDouble));
        System.out.println("Деление первого элемента массива на остальные элемента массива (arrayDouble): "
                + calculator.div(arrayDouble));

        System.out.println("Бинарный перевод 10011011 (параметр типа int): " + calculator.binaryToDecimal(10011011));

        System.out.println("Бинарный перевод 10011011 (параметр типа String): "
                + calculator.binaryToDecimal("10011011"));

        System.out.println("Перевод в двоичную систему из десятичной числа 155: " + calculator.decimalToBinary(155));
    }
}