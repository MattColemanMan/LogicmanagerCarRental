import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
	static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Paradise Rentals Rental Calculator");
		ArrayList<Order> orders = new ArrayList<>();
		
		Boolean stillLooping = true;
		Boolean hasSUV = false;
		Boolean hasBike = false;		
		
		while(stillLooping){ 
			int vehicleType = getVehicleType();
			
			if(vehicleType == 1){
				Car qq = new Car();
				orders.add(qq);
			}
			if(vehicleType == 2){
				orders.add(new EconomyCar());
			}
			if(vehicleType == 3){
				hasSUV = true;
				orders.add(new SUV());
			}
			if(vehicleType == 4){
				orders.add(new LuxuryCar());
			}
			if(vehicleType == 5){
				orders.add(new Limousine());
			}
			if(vehicleType == 6){
				hasBike = true;
				orders.add(new Bicycle());
			}
			if(vehicleType == 7){
				orders.add(new Scooter());
			}
			if(vehicleType == 8){
				orders.add(new Motorcycle());
			}
			if(vehicleType == 9){
				orders.add(new Jetski());
			}
			
			System.out.println("Ready to complete order? (Y/N)");
			String temp = scan.next();
			if(temp.toLowerCase().startsWith("y")){
				stillLooping = false;
			}
		}
		System.out.println("TOTAL");
		if(hasSUV && hasBike){
			bikeSUVDiscount(orders);
		}
		
		BigDecimal total = new BigDecimal(0);
		for(Order x : orders){
			total = total.add(x.calculate());
		}
		System.out.println("Your total is:");
		System.out.println(total);
		scan.close();
	}
	
	private static Boolean bikeSUVDiscount(ArrayList<Order> orders){
		for(Order x : orders){
			if(x.bikeSUVDiscount()){
				return true;
			}
		}
		return false;
	}
	
	private static int getVehicleType(){
		System.out.println("Please input code for type of vehicle to rent:");
		System.out.println("");
		System.out.println("(1) Midsize Car");
		System.out.println("(2) Economy Car");
		System.out.println("(3) SUV");
		System.out.println("(4) Luxury Car");
		System.out.println("(5) Limousine");
		System.out.println("(6) Bicycle");
		System.out.println("(7) Scooter");
		System.out.println("(8) Motorcycle");
		System.out.println("(9) Jetski");
		int x = scan.nextInt();
		return x;
	}

}
