import java.math.BigDecimal;

public class Bicycle extends Order {
	final static String NAME = "BICYCLE";
	final BigDecimal DAILYRATE = new BigDecimal(10);
	private Boolean SUVDiscount = false;
	
	public Bicycle(){
		super(NAME);
	}
	
	public BigDecimal rateOnDay(Integer day){
		return this.DAILYRATE;
	}
	
	public BigDecimal calculate(){
		if(this.SUVDiscount){
			return new BigDecimal(0);
		}
		
		return super.calculate();
	}
	
	public Boolean bikeSUVDiscount(){
		this.SUVDiscount = true;
		return true;
	}
}
