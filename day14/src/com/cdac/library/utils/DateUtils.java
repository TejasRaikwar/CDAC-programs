package com.cdac.library.utils;

import java.time.LocalDate;

public class DateUtils {
	public static LocalDate getLocalDate(String str) {
		return LocalDate.parse(str);
	}
	
	public static String getStringLocalDate(LocalDate date) {
		return date.toString();
	}
	
}
