 class IfElseNesting{
	public static void main(String args[]){
		int a = 500, b = 1000, c = 1500;
		System.out.println("The largest number is:");
		if(a > b){
			if(a > c){
				System.out.println(a);
			}
		   else{
				System.out.println(c);
		   }
		}
		else{
			if(c > b){
				System.out.println(c);
			}
			else{
				System.out.println(b);
			}
		}
	}
 }