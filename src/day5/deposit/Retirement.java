package day5.deposit;

public class Retirement {

	public static void main(String[] args) {
		
		new Retirement().darkZone(300, 12, 1000000);
		
	}
	
	public void darkZone(int monthlyPayment, int interest, int dreamSum) { // egemesiachnui vzsnos, godovoi procent, gelaemaia summa
		int bankAccount = 0;
		int monthCount = 0;
		double interestMult = interest / 1200d;
		double cashFlow = 0;
		while (bankAccount < dreamSum) {
			bankAccount += monthlyPayment;
			cashFlow = bankAccount * interestMult;
			bankAccount += (int) cashFlow;
			monthCount ++;
			
		}
		
		System.out.println(monthCount + " month");
		System.out.println(monthCount / 12 + " years, " + monthCount % 12 + " month");
		
	}

}
