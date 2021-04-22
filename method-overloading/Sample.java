class Display{
	public void dis(char c){
		System.out.println(c);
	}
	public void dis(char c, int num){
		System.out.println(c + " " + num);
	}
}

class Sample{
	public static void main(String args[]){
		Display obj = new Display();
		obj.dis('A');
		obj.dis('A',15);
	}
}