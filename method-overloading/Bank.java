 class BankSal{
		double salary = 22000;
		String z = "Hello";
		
	double getSalary(){
		return salary;
	}
}
 class EximBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .10;
		return salary;
	}
}
 class janataBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .15;
		return salary;
	}
}
 class sonaliBank extends BankSal{
	double getSalary(){
		salary = salary + salary * .20;
		return salary;
	}
}
class Bank{
	public static void main(String args[]){
	EximBank sl = new EximBank();
	janataBank s2 = new janataBank();
	sonaliBank s3 = new sonaliBank();
	
	System.out.println("The salary of Exim bank is:"+ sl.getSalary());
	System.out.println("The salary of janata bank is:"+ s2.getSalary());
	System.out.println("The salary of sonali bank is:"+ s3.getSalary());

	}
}
