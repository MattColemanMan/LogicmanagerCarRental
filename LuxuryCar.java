import java.math.BigDecimal;

public class LuxuryCar extends Car {
	final static String NAME = "LUXURY CAR";
	final BigDecimal MULTIPLIER = new BigDecimal(2);
	
	public LuxuryCar(){
		super(NAME);
	}
	
	public BigDecimal rateOnDay(Integer day){
		return super.rateOnDay(day).multiply(MULTIPLIER);
	}
	
	public BigDecimal calculate(){
		return super.calculate();
	}
}