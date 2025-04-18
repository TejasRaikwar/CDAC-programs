package com.cdac.school.utils;

import java.time.LocalDate;

public class UtilDate {

	public static LocalDate getDate(String str) {
		return LocalDate.parse(str);
	}

	public static String getStringDate(LocalDate date) {
		return date.toString();
	}

}
