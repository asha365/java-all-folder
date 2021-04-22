class Display3{
	public void dis(char c, int num){
		System.out.println("I am the first definition of method dis");
	}
	public void dis(int num, char c){
		System.out.println("I am the second definition of method dis");
	}
}
class Sample3{
	public static void main(String args[]){
		Display3 obj = new Display3();
		obj.dis('A',15);
		obj.dis(52,'B');
	}
}