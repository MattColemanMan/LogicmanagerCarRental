import java.math.BigDecimal;
import java.util.Scanner;

public class Jetski extends Order {
	final static String NAME = "JETSKI";
	final BigDecimal HOURLYRATE = new BigDecimal(25);
	private BigDecimal hoursPerDay;
	
	Jetski(){
		super(NAME);
		
		System.out.println("How many hours per day?");
		this.hoursPerDay = new BigDecimal(Calculator.scan.nextInt());
	}
	
	public BigDecimal rateOnDay(Integer day){
		return this.HOURLYRATE.multiply(this.hoursPerDay);
	}
}
