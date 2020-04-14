package com.hexaware.trainer;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
    Calendar startCal = Calendar.getInstance();
    startCal.setTime(startDate);        

    Calendar endCal = Calendar.getInstance();
    endCal.setTime(endDate);

    int workDays = 0;

    //Return 0 if start and end are the same
    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
        return 0;
    }

    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
        startCal.setTime(endDate);
        endCal.setTime(startDate);
    }

    do {
       //excluding start date
        startCal.add(Calendar.DAY_OF_MONTH, 1);
        if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            ++workDays;
        }
    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

    return workDays+1;
}
    
    public static void main( String[] args) throws ParseException
    {
        String str1 = "2020-04-03";
        String str2 = "2020-04-15";
       SimpleDateFormat sdf 
            = new SimpleDateFormat("yyyy-MM-dd"); 
        Date dt1 = sdf.parse(str1);
        Date dt2 = sdf.parse(str2);
       System.out.println(getWorkingDaysBetweenTwoDates(dt1, dt2));
        System.out.println( "Hello World!" );
    }
}
