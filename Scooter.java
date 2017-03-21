import java.math.BigDecimal;

public class Scooter extends Order{
	final static String NAME = "SCOOTER";
	final BigDecimal DAILYRATE = new BigDecimal(25);
	
	public Scooter(){
		super(NAME);
	}
	
	public BigDecimal rateOnDay(Integer day){
		return this.DAILYRATE;
	}
	
	public BigDecimal calculate(){
		return super.calculate();
	}
}
