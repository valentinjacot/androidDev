package graviDisc;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;


public class Main {
	public static long getDifferenceDays(Calendar d1,Calendar d2) {
	    long diff = d2.getTime().getTime() - d1.getTime().getTime();
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar today = Calendar.getInstance();
//		System.out.println(today.DAY_OF_MONTH);
		System.out.println(sdf.format(today.getTime()));
		Calendar term = new GregorianCalendar(2020,5,11); //month start at 0
		System.out.println(sdf.format(term.getTime()));
		int res=(int)getDifferenceDays(today,term);
		System.out.println(getDifferenceDays(today,term));
		System.out.println(Math.ceil(res/7));
		System.out.println(Math.floorMod(res, 7));
	}

}



//// TODO Auto-generated method stub
//SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy
//Calendar today = Calendar.getInstance();
////today.set(Calendar.HOUR_OF_DAY, 0); // same for minutes and seconds
////today.set(Calendar.MINUTE, 0); // same for minutes and seconds
////today.set(Calendar.SECOND, 0); // same for minutes and seconds
//
//Calendar term = Calendar.getInstance();
//term.set(Calendar.MONTH, 6); // same for minutes and seconds
//term.set(Calendar.DAY_OF_MONTH, 6); // same for minutes and seconds
////term.set(Calendar.SECOND, 0); // same for minutes and seconds
//
//
//System.out.println(today.getTime());