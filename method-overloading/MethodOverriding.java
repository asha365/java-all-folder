class Parent{
	public void display(){
		System.out.println("i am parent");
	}
}

class Child extends Parent{
	public void display(){
		System.out.println("i am child class");
	}
}

public class MethodOverriding{
	
	public static void main(String args[]){
		Parent a = new Parent();
		Parent b = new Child();
		
		a.display();
		b.display();
	}
	
}