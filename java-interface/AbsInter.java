interface A{
	void a();  //by default, public and abstract
	void b();
	void c();
	void d();
}
//creating abstract class that provides the implementaion of one method of A interface

abstract class B implements A{
	public void c(){System.out.println("I am c");}
	
	//creating subclass of abstract class, now we need to provides the implementaion of rest of the methods
}
class M extends B{
		public void a(){System.out.println("I am a");}
		public void b(){System.out.println("I am b");}
		public void d(){System.out.println("I am d");}
	}

	//creating a AbsInter class that calls the methods of interface
	class AbsInter{
		public static void main(String args[]){
			//M a=new M();
			A a=new M();
			a.a();
			a.b();
			a.c();
			a.d();
		}
	}
