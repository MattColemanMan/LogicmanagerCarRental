import java.math.BigDecimal;
import java.util.Scanner;

public class SUV extends Car {
	final static String NAME = "SUV";
	final BigDecimal OFFROADCHARGE = new BigDecimal(15);
	final BigDecimal MULTIPLIER = new BigDecimal(1.5);
	
	public SUV(){
		super(NAME);
		System.out.println("Off Roading? (+$" + this.OFFROADCHARGE + ") (Y/N)");
		String offroad = Calculator.scan.next();

		if(offroad.toLowerCase().startsWith("y")){
			super.charges.put("OffRoad Charge", this.OFFROADCHARGE);
		}
	}
	
	public BigDecimal rateOnDay(Integer day){
		return super.rateOnDay(day).multiply(MULTIPLIER);
	}
	
	public BigDecimal calculate(){
		return super.calculate();
	}
}
