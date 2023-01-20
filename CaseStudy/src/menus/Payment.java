package menus;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Payment {
	DecimalFormat numberFormat = new DecimalFormat("#.00");
	Scanner in = new Scanner(System.in);
	public double totalPrice,totalwVAT,userpayment,change;
	public double VAT;
	public String NAME="Steve";
	
	double boatPrice, destPrice, timePrice, basePrice = 20000.00;
	public Payment(double _boatPrice, double _destPrice, double _timePrice) {
		boatPrice = _boatPrice;
		destPrice = _destPrice;
		timePrice = _timePrice;
	}
	
	public void PAYMENT() {
		totalPrice = boatPrice+destPrice+timePrice+basePrice;
		VAT = totalPrice*0.12;
		totalwVAT = totalPrice+VAT;
		

		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("\t PAYMENT");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Base price: \t \t"+basePrice);
		System.out.println("Boat price: \t \t"+boatPrice);
		System.out.println("Time price: \t \t"+timePrice);
		System.out.println("Destination price: \t"+destPrice);
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("VAT:   \t \t \t"+VAT);
		System.out.println("TOTAL: \t \t \t"+totalwVAT);


	}
	
	public void CHECKING() {
		boolean loop = false;

		while(!loop) {
			System.out.print("\nPlease input your payment: ");
			userpayment = in.nextInt();
			
			if(userpayment<totalwVAT) {
				System.out.println("Insufficient funds. Please try again");
			} else {
				System.out.println("Please enter your name: ");
				NAME = in.nextLine();
				System.out.println("Transaction complete!");
				loop = true;
			}
		}
		
		
		
	}

	public void RECEIPT() {
		//this part will be the printing of the receipt
		System.out.println("\nHere's your receipt");
		change = userpayment-totalwVAT;
		
		//NAME OF THE CRUISE SHIP/COMPANY
		//BASEPRIC = Base Price
		//SHPOFCHC = Ship of Choice
		//TMEOFVOY = Time of Voyage
		//DESTIPRC = Destination Price
		
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("\t  TITANIC");
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("\t\t\t PHP"+"\nBASEPRIC: "+"\t\t "+basePrice);
		System.out.println("SHPOFCHC: "+"\t\t "+boatPrice);
		System.out.println("TMEOFVOY: "+"\t\t "+timePrice);
		System.out.println("DESTIPRC: "+"\t\t "+destPrice);
		
		System.out.println("\nVAT:   "+"\t\t\t "+ VAT);
		System.out.println("TOTAL: "+"\t\t\t"+ totalwVAT);
		System.out.println("PAYMENT: "+"\t\t"+ userpayment);
		System.out.println("CHANGE: "+"\t\t"+ numberFormat.format(change));

		//ADDITIONAL INFORMATION 
		
		System.out.println("\n\nCUSTOMER NAME: "+ NAME);
		System.out.println("DATE ISSUED:   01/01/2023");
		
		//MISCELLANEOUS 
		System.out.println("\nThank you for choosing us..."+"\n      Have a nice trip!");
		System.out.println("++++++++++++++++++++++++++++");
	}

}
