package Frameworkstart.first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class sampletest {

	public static void main(String[] args) {
  gettime();
	}

	private static void gettime() {
		
		Date date= new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
		 System.out.println(formatter.format(date));
		
		
	}

}
