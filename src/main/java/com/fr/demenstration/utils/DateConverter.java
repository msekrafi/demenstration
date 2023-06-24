package com.fr.demenstration.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public   class DateConverter {
	public static Date getDateFromString(String dateString) {
		String formatPattern = "dd/MM/yyyy";
  System.out.println("===================="+dateString);
        SimpleDateFormat sdf = new SimpleDateFormat(formatPattern);
        Date date=new Date();

        try {
            date = sdf.parse(dateString);
            System.out.println("Date convertie : " + date);
        } catch (ParseException e) {
            System.out.println("Erreur lors de la conversion de la chaîne en date : " + e.getMessage());
        }
		
		return date;
		
	}

}
