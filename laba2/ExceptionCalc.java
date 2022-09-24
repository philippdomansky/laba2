package laba2;

import com.sun.nio.file.ExtendedOpenOption;
import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ExceptionCalc {
    static int count;
    public static void main(String[] args) {

        System.out.println("Введите кол-во чисел");

        errorNumber();


    }




    public static void errorNumber() {
        try {
            try {

                Scanner sc = new Scanner(System.in);

                count = sc.nextInt();
                sc.nextLine();
                if (count == 0) {

                    System.out.println("Кол-во чисел не может ровняться нулю");

                    System.out.println("\nВведите заново кол-во чисел");
                    errorNumber();

                }


                ExceptionOop[] exop = new ExceptionOop[count];


                for (int i = 0; i < exop.length; i++) {


                    exop[i] = new ExceptionOop();
                    System.out.println("Введите положительное число ");


                    exop[i].averagePosNum = sc.nextInt();

                    if (exop[i].averagePosNum < 0) {
                        System.out.println("Вы вводите отрицательное(-ые) число");
                        System.out.println("перезапуск программы...");

                        System.out.println("\nВведите заново кол-во чисел");
                        errorNumber();

                    }
                    if (exop[i].averagePosNum < 0) {
                        System.out.println("Вы ввели отрицательные числа");

                        System.out.println("\nВведите заново кол-во чисел");
                        errorNumber();
                    }


                }


//                for (int i = 0; i < exop.length; i++) {
//                    if (exop[i].averagePosNum < 0) {
//                        System.out.println("Вы вводите отрицательное(-ые) число");
//                        System.out.println("перезапуск программы...");
//
//                        System.out.println("\nВведите заново кол-во чисел");
//                        errorNumber();
//
//                    }
//                }
//                for (int i = 0; i < exop.length; i++) {
//                    if (exop[i].averagePosNum < 0) {
//                        System.out.println("Вы ввели отрицательные числа");
//
//                        System.out.println("\nВведите заново кол-во чисел");
//                        errorNumber();
//                    }
//                }


                System.out.println("Среднее значение");
                averageMassNumbers(exop);


                errorMassNegative(exop);

            } catch (NegativeArraySizeException exception) {

                System.out.println("Кол-во чисел не может быть отрицательным");
                System.out.println("\nВведите заново кол-во чисел");
                errorNumber();

            }








        } catch (InputMismatchException exception) {
            System.out.println("Вы ввели не коректные данные, перезапуск программы...");
            System.out.println("Введите ещё раз кол-во чисел");

            errorNumber();

        }



    }

    public static void errorMassNegative(ExceptionOop[] exop) {
        for (int i = 0; i < exop.length; i++) {
            if (exop[i].averagePosNum < -1) {
                System.out.println("Вы ввели отрицательные числа или 0");

                System.out.println("\nВведите заново кол-во чисел");
                errorNumber();
            }
        }

    }
    public static void averageMassNumbers(ExceptionOop[] exop) {

        int sum = 0;
        for (int i = 0; i < exop.length; i++) {

            sum = sum + exop[i].averagePosNum;

        }
        int average = sum / exop.length;

        System.out.println("Среднее ариф -> " + average);


    }




}
