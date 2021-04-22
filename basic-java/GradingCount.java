class GradingCount{
	public static void main(String args[]){
		if(marks > 79){
			grade = "Honors";
		}
		else if(marks > 59){
			grade = "First Division";
		}
		else if(marks > 49){
			grade = "second Division";
		}
		else if(marks > 39){
			grade = "Third Division";
		}
		else{
			grade = "Fail";
			System.out.println("Grade: "+grade);
		}
		
	}
}