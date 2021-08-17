package com.company;

public class TypeСonversion {
	
	public static char charExpression(int a) {
		/*возвращение символа после обратного слэша (он под номером 92 в таблице UNICODE)*/
		return(char) (92 + a);
	}
	public static boolean isPowerOfTwo(int value) {
        /*проверка на количество единичек в двоичном виде числа
        если единичка одна, то это степень двойки*/
		return Integer.bitCount(Math.abs(value)) == 1;
	}
}
