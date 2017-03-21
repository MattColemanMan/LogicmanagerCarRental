import java.math.BigDecimal;
import java.util.Scanner;

public class Limousine extends Order {
	final static String NAME = "LIMOUSINE";
	
	private BigDecimal dailyrate = new BigDecimal(100);
	
	final BigDecimal DRIVERRATE = new BigDecimal(150);
	final BigDecimal PREMIUMRATE = new BigDecimal(75);
	final BigDecimal SUNDAYRATE = new BigDecimal(100);
	
	final BigDecimal FRIDAYMULT = new BigDecimal(1.40);
	final BigDecimal SATURDAYMULT = new BigDecimal(1.40);
	
	
	Limousine(){
		super(NAME);
		
		System.out.println("Reminder that the flat $" + SUNDAYRATE + "Sunday rate includes a Driver and Premium Upgrade");
		
		System.out.println("Add a Driver? (+$" + DRIVERRATE + ") (Y/N)");
		String driver = Calculator.scan.nextLine();
		
		System.out.println("Upgrade to Premium Package? (+$" + PREMIUMRATE + ") (Y/N)");
		String premium = Calculator.scan.nextLine();
		
		if(driver.toLowerCase().startsWith("y")){
			this.dailyrate = this.dailyrate.add(DRIVERRATE);
		}
		if(premium.toLowerCase().startsWith("y")){
			this.dailyrate = this.dailyrate.add(PREMIUMRATE);
		}
	}


	public BigDecimal rateOnDay(Integer day){
		int dayCode = day % 7;
		
		//Friday
		if(dayCode == 5) { 
			return this.dailyrate.multiply(FRIDAYMULT);
		}
		
		//Saturday
		if(dayCode == 6) { 
			return this.dailyrate.multiply(SATURDAYMULT);
		}
		
		//Sunday
		if(dayCode == 0) { 
			return this.SUNDAYRATE;
		}
		
		//all other days
		return this.dailyrate;
	}
	
	public BigDecimal calculate(){
		return super.calculate();
	}
	
	
}
