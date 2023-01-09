package day1.basics;

public class largest {

	public static void main(String[] args) {
		int num1=-25;
		int num2=-15;
		int num3=-4;
		if(num1>=num2 && num2>=num3)
			System.out.println("num1 is largest");
		else if(num2>=num3 && num2>=num1)
			System.out.println("num2 is largest");
		else 
			System.out.println("num3 is largest");

	}

}
