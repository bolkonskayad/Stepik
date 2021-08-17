package com.company;

public class PrimitiveTypes {
	
	public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        /*это работает и слава богу
        лучше вставлю анекдот категории б
        Позвонил Путин Зеленскому и молчит в трубку.
        Зеленский его спрашивает:
        - Вова, ну и что ты молчишь?
        - Тебя спросить забыл - кладёт трубку*/
		return (a || b || c || d) && !(a && b && c && d) && !(a ^ b ^ c ^ d);
	}
	
	public static int leapYearCount(int year) {
		/*високосный год - кратен 4 и 400 и не кратен 100*/
		return (year/4)+(year/400)-(year/100);
	}
	
	public static boolean doubleExpression(double a, double b, double c) {
        /*проверка суммы первых двух переменных
        на равенство третьей переменной с погреностью 0,001*/
		return Math.abs((a + b)-c)< 0.0001;
	}
	
	public static int flipBit(int value, int bitIndex) {
        /*изменение одного бита по индексу на противоположный с помощью операции XOR (^)
        bitIndex - 1 так как отсчёт по заданию начинается не с 0, а с 1*/
		return value ^ (1 << (bitIndex - 1));
	}
}
