import java.math.BigDecimal;

public class Car extends Order {
	final static String NAME = "MIDSIZED CAR";
	final BigDecimal BASERATE = new BigDecimal(30);
	final BigDecimal FRIMULT = new BigDecimal(1.25);
	final BigDecimal SATMULT = new BigDecimal(1.25);
	final BigDecimal SUNMULT = new BigDecimal(.8);
	
	public Car(){
		super(NAME);
	}
	
	public Car(String name){
		super(name);
	}
	
	public BigDecimal rateOnDay(Integer day){
		int dayCode = day % 7;
		
		//Friday
		if(dayCode == 5) { 
			return this.BASERATE.multiply(FRIMULT);
		}
		
		//Saturday
		if(dayCode == 6) { 
			return this.BASERATE.multiply(SATMULT);
		}
		
		//Sunday
		if(dayCode == 0) { 
			return this.BASERATE.multiply(SUNMULT);
		}
		
		//all other days
		return this.BASERATE;
	}
	
	public BigDecimal calculate(){
		return super.calculate();
	}
}