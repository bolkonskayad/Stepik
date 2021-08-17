package com.company;

public class ArrAndStr {
	
	public static boolean isPalindrome(String text) {
		/*использование регулярного выражения для очистки лишних символов
		(в данном случае удаляется всё, кроме букв и цифр)*/
		String textnosigns = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
		/*использование метода StringBuilder для отображения строки*/
		String textflippedover = new StringBuilder(textnosigns).reverse().toString();
		/*возвращение результата проверки строки на палиндромность
		с игнорированием регистра*/
		return textnosigns.equalsIgnoreCase(textflippedover);
	}
}