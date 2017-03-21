import java.math.BigDecimal;

public class EconomyCar extends Car{
	final static String NAME = "ECONOMY CAR";
	final BigDecimal MULT = new BigDecimal(.5);
	
	public EconomyCar(){
		super(NAME);
	}
	
	public BigDecimal rateOnDay(Integer day){
		return super.rateOnDay(day).multiply(MULT);
	}
	
	public BigDecimal calculate(){
		return super.calculate();
	}
}
