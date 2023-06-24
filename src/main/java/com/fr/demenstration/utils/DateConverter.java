package com.fr.demenstration.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public   class DateConverter {
	public static Date getDateFromString(String dateString) {
		String formatPattern = "dd/MM/yyyy";
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
	public static int calculerAge(Date dateNaissance) {
	    Calendar calendrierNaissance = Calendar.getInstance();
	    calendrierNaissance.setTime(dateNaissance);

	    Calendar calendrierActuel = Calendar.getInstance();

	    int anneeNaissance = calendrierNaissance.get(Calendar.YEAR);
	    int moisNaissance = calendrierNaissance.get(Calendar.MONTH);
	    int jourNaissance = calendrierNaissance.get(Calendar.DAY_OF_MONTH);

	    int anneeActuelle = calendrierActuel.get(Calendar.YEAR);
	    int moisActuel = calendrierActuel.get(Calendar.MONTH);
	    int jourActuel = calendrierActuel.get(Calendar.DAY_OF_MONTH);

	    int age = anneeActuelle - anneeNaissance;

	    if (moisActuel < moisNaissance || (moisActuel == moisNaissance && jourActuel < jourNaissance)) {
	        age--;
	    }

	    return age;
	}

}
