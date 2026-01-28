package date_currency;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatExample {
	public static void main(String[] args) {
		double amount = 123456.789;

		// India
		NumberFormat indiaformat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		System.out.println(indiaformat.format(amount));

		// US
		NumberFormat USformat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(USformat.format(amount));
		
		// Japan
		NumberFormat Japanformat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(Japanformat.format(amount));
	}
}
