import java.util.Scanner;

interface Calculator{
	final static double x=5,y=6;
	abstract double sum(double e, double z);
	abstract double min(double e, double z);
	abstract double multi(double e, double z);
	abstract double div(double e, double z);	
}
interface Summation{
	double sum(double a, double b);
}
class InterfaceImplementedClass implements Calculator,summation{
	double x,y;
	void hello(){
		System.out.println("This is Interface Implemented Class");
	}
	
	public double sum(double a, double b){
		x = a;
		y = b;
		double c = x+y;
		return c;
	}
		public double sum(double a, double b){
		x = a;
		y = b;
		double c = x*y;
		return c;
	}
		public double sum(double a, double b){
		x = a;
		y = b;
		double c = x-y;
		return c;
	}
		public double sum(double a, double b){
		x = a;
		y = b;
		double c = x/y;
		return c;
	}
}

class InterfaceExam{
	public static void main(String agrs[]){
		InterfaceImplementedClass c = new InterfaceImplementedClass();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(Enter Any Value:);
		double num1 = s.nextDouble();
		
		System.out.println(Enter Any Value:);
		double num2 = s.nextDouble();
		
		c.hello();
		double temp = c.sum(num1,num2);
		System.out.println("Summation of a and b:"+temp);
		
		double temp1 = c.sum(num1,num2);
		System.out.println("Summation of a and b:"+temp);
		
		double temp2 = c.sum(num1,num2);
		System.out.println("Summation of a and b:"+temp);
		
		double temp3 = c.sum(num1,num2);
		System.out.println("Summation of a and b:"+temp);
	}
}










