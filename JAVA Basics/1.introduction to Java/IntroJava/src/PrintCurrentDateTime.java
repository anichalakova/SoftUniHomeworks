import java.sql.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class PrintCurrentDateTime {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar now = Calendar.getInstance();
		System.out.println(dateFormat.format(now.getTime()));
	}

}
