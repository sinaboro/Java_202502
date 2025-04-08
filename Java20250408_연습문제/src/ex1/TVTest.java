package ex1;

public class TVTest {

	public static void main(String[] args) {
		
		TV saleTV  = new SaleTV("SALETV-1",40,1, 300000);
		TV rentalTV  = new RentalTV("RENTALTV-10",42,1, 100000);
		
		saleTV.channelUp();
		saleTV.channelUp();
		
		rentalTV.channelDown();
		rentalTV.channelDown();
		rentalTV.channelDown();
		
		printAllTV(saleTV);
		printAllTV(rentalTV);
		
		
	}
	
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		tv.play();
	}

}
