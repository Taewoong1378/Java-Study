package num61_70;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class num61 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.of(2014, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format (DateTimeFormatter.ISO_DATE));
	}
}
