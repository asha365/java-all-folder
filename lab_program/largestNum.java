package javabeginner;

public class JavaBeginner {

    public static void main(String[] args) {

        int num1=20,num2=30,num3=50;

        if(num1>=num2&&num1>=num3){

            System.out.println("The largest number" +num1);
        }

        else if(num2>=num1&&num2>=num3){

            System.out.println("The largest number" +num2);
        }

        else{

            System.out.println("The largest number" +num3);

        }
    }
}