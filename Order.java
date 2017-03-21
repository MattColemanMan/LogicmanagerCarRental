import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public abstract class Order {
	List<Integer> rentalDays; //list of dates a vehicle will be rented on
	HashMap<String, BigDecimal> charges = new HashMap<>(); //map of extra charge names to values
	
	Order(String name){
		System.out.println(name + " RENTAL");
		System.out.println("Start Day? (Today is Monday Jan 1)");
		int start = Calculator.scan.nextInt();
		System.out.println("End Day? (Today is Monday Jan 1)");
		int end = Calculator.scan.nextInt();
		
		this.rentalDays = new ArrayList<Integer>();
		for(int x = start; x <= end; x++){
			this.rentalDays.add(x);
		}
	}
	
	abstract BigDecimal rateOnDay(Integer dayCode);
	
	public BigDecimal calculate(){
		BigDecimal total = this.rentalDays.stream()
				.map(x -> this.rateOnDay(x))
				.reduce(new BigDecimal(0), BigDecimal::add);
		
		total = total.add(
				this.charges.values().stream().reduce(new BigDecimal(0), BigDecimal::add));
		
		return total.setScale(2, RoundingMode.FLOOR);
	}
	
	public Boolean bikeSUVDiscount(){
		return false;
	}
}
