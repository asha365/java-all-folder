class Bank{
	int getRateOfInterest(){return 0;}
}
class SBI extends Bank{
	int getRateOfInterest(){return 9;}
}
class ICICI extends Bank{
	int getRateOfInterest(){return 10;}
}
class AXIS extends Bank{
	int getRateOfInterest(){return 11;}
}

class methodOverriding{
	public static void main(String args[]){
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI Rate of interst:"+ s.getRateOfInterest());
		
		System.out.println("ICICI Rate of interst:"+ i.getRateOfInterest());
		
		System.out.println("AXIS Rate of interst:"+ a.getRateOfInterest());
		
	}
}