import java.math.BigDecimal;
import java.util.Scanner;

public class Motorcycle extends Car {
	final static String NAME = "MOTORCYCLE";
	
	private int age;
	
	final BigDecimal HAZARD18t25 = new BigDecimal(50);
	final BigDecimal HAZARD26t32 = new BigDecimal(35);
	final BigDecimal HAZARD33t45 = new BigDecimal(15);
	final BigDecimal HAZARD45t99 = new BigDecimal(0);
	
	public Motorcycle(){
		super(NAME);
				
		System.out.println("How old is the renter? (Hazard Insurance)");
		this.age = Calculator.scan.nextInt();

		if(age <= 25) {
			this.charges.put("Hazard Insurance 18-25", HAZARD18t25);
		}else if(age <= 32) {
			this.charges.put("Hazard Insurance 26-32", HAZARD26t32);
		}else if(age <= 45) {
			this.charges.put("Hazard Insurance 33-45", HAZARD33t45);
		}else {
			this.charges.put("Hazard Insurance 33-45", HAZARD45t99);
		}
		
	}
	
	public BigDecimal calculate(){
		return super.calculate();
	}

}
