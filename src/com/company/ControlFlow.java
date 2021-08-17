package com.company;

import java.math.BigInteger;

public class ControlFlow {
	
	public static BigInteger factorial(int value) {
		/*Присваивание переменной начального значения (1)*/
		BigInteger result = BigInteger.valueOf(1);
		/*Умножение переменной на остальные значения*/
		for (int i = value; i > 0; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
	/*сортировка слиянием*/
	public static int[] mergeArrays(int[] a1, int[] a2) {
		/*создание нового массива, в который будет записан результат сортировки*/
		int [] result = new int[a1.length+ a2.length];
		int i = 0, j = 0, r = 0;
		while (i < a1.length && j < a2.length) {
            /*если i-элемент массива а1 меньше элемента j-элемента массива а2,
            то записывается в результирующий массив i-элемент массива а1*/
			if (a1[i] < a2[j]) {
				result[r] = a1[i];
				i++;
			}
			/*если наоборот, то записывается в результирующий массив j-элемент массива а2*/
			else {
				result[r] = a2[j];
				j++;
			}
			r++;
		}
        /*если i счётчик меньше длины массива а1,
        то копируем оставшиеся элементы массива а1 в результирующий*/
		if (i < a1.length) {
			System.arraycopy(a1, i, result, r, (a1.length - i));
		}
        /*если j счётчик меньше длины массива а2,
        то копируем оставшиеся элементы массива а2 в результирующий*/
		if (j < a2.length) {
			System.arraycopy(a2, j, result, r, (a2.length - j));
		}
		return result ;
	}
	
	public static String printTextPerRole(String[] roles, String[] textLines) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < roles.length; i++) {
			/*Добавляем роль в сценарий*/
			sb.append(roles[i] + ":" + "\n");
			for (int j = 0; j < textLines.length; j++) {
				/*проверка на то, что начало строки начинается с названия роли*/
				if (textLines[j].startsWith(roles[i] + ":")) {
					/*добавление текста строки с её номером в основном тексте*/
					sb.append((j + 1) + ") " + textLines[j].substring(roles[i].length() + 2) + "\n");
				}
			}
			/*переход на новую строку*/
			sb.append("\n");
		}
		return sb.toString();
	}
}
