package com.company;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа реализует приложение, которое
 * содержит решение заданий с базового курса по Java
 * на стандартном потоке вывода.
 *
 * @автор Diana Chibisova
 * @версия 1.0
 * @от   2021-08-17
 */

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x = 0, x1 = 0, x2 = 0, x3 = 0, x4 = 0;
        String s = null, s1 = null, s2 = null, s3 = null, s4 = null;
        
        do {
            System.out.println("1. Примитивные типы");
            System.out.println("2. Преобразование типов");
            System.out.println("3. Массивы и строки");
            System.out.println("4. Управляющие конструкции: условные операторы и циклы");
            System.out.println("5. Выйти");
            System.out.print("Ваш выбор: ");
            
            s = scan.next();
            x = Integer.parseInt(s);
            
            switch (x) {
                case 1:
                    do {
                        PrimitiveTypes z1 = new PrimitiveTypes();
                        System.out.println("1. Поиск двух истин");
                        System.out.println("2. Високосный год");
                        System.out.println("3. Абсолютная погрешность");
                        System.out.println("4. Битовый сдвиг");
                        System.out.println("5. Выйти");
                        System.out.print("Ваш выбор: ");
                        s1 = scan.next();
                        try {
                            x1 = Integer.parseInt(s1);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод");
                        }
                        switch (x1) {
                            case 1:
                                boolean a, b, c, d;
                                System.out.print("Введите для проверки четыре аргумента типа boolean: ");
                                a = scan.nextBoolean();
                                b = scan.nextBoolean();
                                c = scan.nextBoolean();
                                d = scan.nextBoolean();
                                System.out.println("Ответ - " + z1.booleanExpression(a, b, c, d));
                                break;
                            case 2:
                                System.out.print("Введите год: ");
                                int year = scan.nextInt();
                                System.out.println("Високосных лет - " + z1.leapYearCount(year));
                                break;
                            case 3:
                                double a2, b2, c2;
                                System.out.print("Введите числа для проверки: ");
                                a2 = scan.nextDouble();
                                b2 = scan.nextDouble();
                                c2 = scan.nextDouble();
                                System.out.println("Равна ли сумма двух первых чисел третьему? - " + z1.doubleExpression(a2, b2, c2));
                                break;
                            case 4:
                                int value, bitIndex;
                                System.out.print("Введите число: ");
                                value = scan.nextInt();
                                System.out.print("Введите индекс бита, который надо сменить на противоположный: ");
                                bitIndex = scan.nextInt();
                                System.out.println("Полученное число - " + z1.flipBit(value, bitIndex));
                            default:
                                break;
                        }
                    } while ((x1 != 5));
                    break;
                case 2:
                    do {
                        System.out.println("1. Работа с UNICODE");
                        System.out.println("2. Проверка числа на степень двойки");
                        System.out.println("3. Выйти");
                        System.out.print("Ваш выбор: ");
                        s2 = scan.next();
                        TypeСonversion z2 = new TypeСonversion();
                        try {
                            x2 = Integer.parseInt(s2);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод");
                        }
                        switch (x2) {
                            case 1:
                                System.out.print("Введите номер буквы после обратного слэша: ");
                                int a = scan.nextInt();
                                System.out.println("Ответ - " + z2.charExpression(a));
                                break;
                            case 2:
                                System.out.print("Введите число: ");
                                int ch = scan.nextInt();
                                System.out.println("Степень двойки? - " + z2.isPowerOfTwo(ch));
                                break;
                            default:
                                break;
                        }
                    } while (x2 != 3);
                    break;
                case 3:
                    do {
                        System.out.println("1. Палиндром");
                        System.out.println("2. Выйти");
                        System.out.print("Ваш выбор: ");
                        s3 = scan.next();
                        ArrAndStr z3 = new ArrAndStr();
                        try {
                            x3 = Integer.parseInt(s3);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод");
                        }
                        switch (x3) {
                            case 1:
                                Scanner in = new Scanner(System.in);
                                System.out.println("Введите строку на проверку палиндромности: ");
                                String str = in.nextLine();
                                System.out.println("Палиндром? - " + z3.isPalindrome(str));
                                break;
                            default:
                                break;
                        }
                    } while (x3 != 2);
                    break;
                case 4:
                    do {
                        ControlFlow z4 = new ControlFlow();
                        
                        System.out.println("1. Вычисление факториала");
                        System.out.println("2. Сортировка слиянием");
                        System.out.println("3. Группировка сценария");
                        System.out.println("4. Выйти");
                        System.out.print("Ваш выбор: ");
                        
                        s4 = scan.next();
                        
                        try {
                            x4 = Integer.parseInt(s4);
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод");
                        }
                        switch (x4) {
                            case 1:
                                System.out.print("Введите натуральное число, для которого будет высчитан факториал: ");
                                
                                int a = scan.nextInt();
                                
                                System.out.println("Ответ - " + z4.factorial(a));
                                
                                break;
                            case 2:
                                System.out.print("Введите размер первого массива: ");
                                
                                int size1 = scan.nextInt();
                                int[] arr1 = new int[size1];
                                
                                System.out.println("Заполните первый массив элементами");
                                
                                for (int i = 0; i < arr1.length; i++)
                                    arr1[i] = scan.nextInt();
                                
                                System.out.print("Введите размер второго массива: ");
                                
                                int size2 = scan.nextInt();
                                int[] arr2 = new int[size2];
                                
                                System.out.println("Заполните второй массив элементами");
                                
                                for (int i = 0; i < arr2.length; i++)
                                    arr2[i] = scan.nextInt();
                                
                                System.out.println( Arrays.toString(arr1));
                                System.out.println( Arrays.toString(arr2));
                                
                                int[] res = z4.mergeArrays(arr1, arr2);
                                
                                System.out.print("Отсортированный массив: ");
                                System.out.println(Arrays.toString(res));
                                
                                break;
                            case 3:
                                String[] roles = new String[]{
                                        "Городничий", "Аммос Федорович",
                                        "Артемий Филиппович",
                                        "Лука Лукич"};
                                
                                String[] textLines = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                                        "Аммос Федорович: Как ревизор?",
                                        "Артемий Филиппович: Как ревизор?",
                                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                                        "Аммос Федорович: Вот те на!",
                                        "Артемий Филиппович: Вот не было заботы, так подай!",
                                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
                                
                                System.out.println(z4.printTextPerRole(roles, textLines));
                                break;
                            default:
                                break;
                        }
                    }while (x4!=4);
                default:
                    break;
            }
        }while (x!=5);
        
        System.out.println("До свидания!");
    }
}
