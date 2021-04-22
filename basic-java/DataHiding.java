//data hiding
//userName & password
class Test{
	private String userName;
	private String password;
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public void setpassword(String password){
		this.password = password;
	}
	
	public String getpassword(){
		return password;
	}
}
	
	public class DataHiding{
		public static void main(String args[]){
			Test test = new Test();
			test.setUserName("Asha");
			test.setspassword("12345");
			System.out.println("UserName="+test.getUserName()+"\n"+"password="+test.getpassword());	
		}
	}
	
	Output is:
		//UserName=Asha
		//password=12345
	