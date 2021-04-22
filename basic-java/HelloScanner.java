//using scanner class


import java.util.Scanner;
class HelloScanner{
	public static void main(String args[]){
		System.out.println("Hello world");
		
		Scanner a = new Scanner(System.in);
		float num = a.nextFloat();
		System.out.print("The Entered number is:"+num);
	}
}

/**output is:
Hello world
5
The Entered number is:5.0*/